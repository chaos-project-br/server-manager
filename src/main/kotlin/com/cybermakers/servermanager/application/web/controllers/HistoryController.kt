package com.cybermakers.servermanager.application.web.controllers

import com.cybermakers.servermanager.application.web.payloads.HistoryRequest
import com.cybermakers.servermanager.application.web.payloads.HistoryResponse
import com.cybermakers.servermanager.domain.services.HistoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import javax.validation.Valid

@RestController
@RequestMapping("history")
class HistoryController(
    private val historyService: HistoryService
) {

    @PostMapping
    fun registerHistory(
        @RequestBody @Valid
        historyRequest: HistoryRequest,
        uriComponentsBuilder: UriComponentsBuilder
    ): ResponseEntity<HistoryResponse> {
        val createdHistory = historyService.registerHistory(historyRequest)

        val uri = uriComponentsBuilder.path("/history").buildAndExpand(createdHistory.name).toUri()

        return ResponseEntity.created(uri).body(createdHistory)
    }
}
