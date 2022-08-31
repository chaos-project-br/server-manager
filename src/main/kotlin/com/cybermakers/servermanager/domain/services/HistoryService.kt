package com.cybermakers.servermanager.domain.services

import com.cybermakers.servermanager.application.web.payloads.HistoryRequest
import com.cybermakers.servermanager.application.web.payloads.HistoryResponse

interface HistoryService {
    fun registerHistory(historyRequest: HistoryRequest): HistoryResponse
}
