package com.cybermakers.servermanager.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("history")
data class History(

    @Id
    val _id: UUID = UUID.randomUUID(),

    val name: String,
    val dics: Double,
    val ram: Double,
    val processor: Double
)
