package io.github.jonasfschuh.kotlin_avengers_api.resource.avenger

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class AvengerRepositoryImpl {
    @Autowired private val repository: AvengerEntityRepository

}