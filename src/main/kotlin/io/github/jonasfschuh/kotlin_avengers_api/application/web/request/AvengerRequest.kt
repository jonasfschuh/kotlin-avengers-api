package io.github.jonasfschuh.kotlin_avengers_api.application.web.request

data class AvengerRequest(
    val nick: String,
    val person: String,
    val description: String,
    val history: String
)
