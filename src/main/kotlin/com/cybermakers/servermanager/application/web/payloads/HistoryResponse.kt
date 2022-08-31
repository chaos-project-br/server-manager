package com.cybermakers.servermanager.application.web.payloads

import com.cybermakers.servermanager.domain.entities.History
import java.time.LocalDateTime

data class HistoryResponse(
    val name: String,
    val datetime: LocalDateTime
) {
    constructor(history: History) : this(
        name = history.name,
        datetime = history.datetime
    )
}
