package io.github.jonasfschuh.kotlin_avengers_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["io.github.jonasfschuh.kotlin_avengers_api.resource.avenger"])
class KotlinAvengersApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinAvengersApiApplication>(*args)
}
