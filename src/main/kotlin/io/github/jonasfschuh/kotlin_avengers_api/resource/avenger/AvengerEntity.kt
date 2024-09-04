package io.github.jonasfschuh.kotlin_avengers_api.resource.avenger

import io.github.jonasfschuh.kotlin_avengers_api.domain.avenger.Avenger
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class AvengerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    val nick: String,
    @Column(nullable = false)
    val person: String,
    val description: String?,
    val history: String?
) {
    fun toAvenger() = Avenger(id, nick, person, description, history)
}
