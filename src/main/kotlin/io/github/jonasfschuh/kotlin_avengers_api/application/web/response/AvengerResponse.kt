package io.github.jonasfschuh.kotlin_avengers_api.application.web.response

data class AvengerResponse(
    val nick: String,
    val person: String,
    val description: String,
    val history: String
)
