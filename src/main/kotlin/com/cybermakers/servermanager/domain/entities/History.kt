package com.cybermakers.servermanager.domain.entities

import com.cybermakers.servermanager.application.web.payloads.HistoryRequest
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.UUID

@Document("history")
data class History(

    @Id
    val _id: ObjectId? = null,

    val name: String,
    val disc: Double,
    val ram: Double,
    val processor: Double,
    val datetime: LocalDateTime = LocalDateTime.now()
) {
    constructor(historyRequest: HistoryRequest) : this(
        name = historyRequest.name,
        disc = historyRequest.discs,
        ram = historyRequest.ram,
        processor = historyRequest.processor
    )
}
