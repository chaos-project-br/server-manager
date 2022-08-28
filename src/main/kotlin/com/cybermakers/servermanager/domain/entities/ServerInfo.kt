package com.cybermakers.servermanager.domain.entities

data class ServerInfo(
    val name: String,
    val ip: String,
    val owner: List<String>? = null,
    val specification: Specification
)
