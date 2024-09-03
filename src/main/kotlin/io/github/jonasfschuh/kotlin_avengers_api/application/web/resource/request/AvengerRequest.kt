package io.github.jonasfschuh.kotlin_avengers_api.application.web.resource.request

import io.github.jonasfschuh.kotlin_avengers_api.domain.avenger.Avenger
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import org.jetbrains.annotations.NotNull

data class AvengerRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val nick: String,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val person: String,
    val description: String? = "",
    val history: String? = ""
) {
    fun toAvenger() = Avenger(id, nick, person, description, history)
}