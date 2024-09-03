package io.github.jonasfschuh.kotlin_avengers_api.application.web.resource

import io.github.jonasfschuh.kotlin_avengers_api.application.web.resource.request.AvengerRequest
import io.github.jonasfschuh.kotlin_avengers_api.application.web.resource.response.AvengerResponse
import io.github.jonasfschuh.kotlin_avengers_api.domain.avenger.Avenger
import io.github.jonasfschuh.kotlin_avengers_api.domain.avenger.AvengerRepository
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["v1/api/avenger"])
class AvengerResource(
    @Autowired private val repository: AvengerRepository
) {

    @GetMapping
    fun getAvengers() = repository.getAvengers()
        .map { AvengerResponse.from(it) }
        .let {
            ResponseEntity.ok().body(it)
        }

    @GetMapping(value =  "{id}")
    fun getAvengersDetails(@PathVariable( value = "id") id: Long) =
        repository.getDetail(id).let {
            ResponseEntity.ok().body(AvengerResponse.from(it))
        }

    @PostMapping
    fun createAvenger(@Valid @RequestBody request: AvengerRequest) =
        request.toAvenger().run {
            repository.create(this)
        }.let {
            ResponseEntity<Avenger>
        }

}