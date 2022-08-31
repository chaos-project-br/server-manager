package com.cybermakers.servermanager.domain.services.impl

import com.cybermakers.servermanager.application.web.payloads.HistoryRequest
import com.cybermakers.servermanager.application.web.payloads.HistoryResponse
import com.cybermakers.servermanager.domain.entities.History
import com.cybermakers.servermanager.domain.repositories.HistoryRepository
import com.cybermakers.servermanager.domain.services.HistoryService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class HistoryServiceImpl(
    private val historyRepository: HistoryRepository
) : HistoryService {
    override fun registerHistory(historyRequest: HistoryRequest): HistoryResponse {
        try {
            historyRepository.save(History(historyRequest)).let {
                logger.info("Save data from ${it.name} at ${it.datetime}")
                return HistoryResponse(it)
            }
        } catch (err: Exception) {
            logger.error("Error while trying save data from ${historyRequest.name}: \n$err")
            throw err
        }
    }

    companion object {
        private val logger = LoggerFactory.getLogger(HistoryService::class.java)
    }
}
