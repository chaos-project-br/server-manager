package com.cybermakers.servermanager.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("server_info")
data class ServerInfo(

    @Id
    val _id: UUID? = UUID.randomUUID(),

    val name: String,
    val ip: String,
    val owner: List<String>? = null,
    val specification: Specification
)
