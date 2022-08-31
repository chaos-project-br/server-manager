package com.cybermakers.servermanager.application.web.payloads

import org.jetbrains.annotations.NotNull
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotEmpty

@Validated
data class HistoryRequest(

    @NotNull
    @NotEmpty
    val name: String,

    @NotNull
    @NotEmpty
    val discs: Double,

    @NotNull
    @NotEmpty
    val ram: Double,

    @NotNull
    @NotEmpty
    val processor: Double
)
