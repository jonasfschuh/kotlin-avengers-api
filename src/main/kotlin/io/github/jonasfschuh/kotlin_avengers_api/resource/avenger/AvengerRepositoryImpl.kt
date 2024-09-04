package io.github.jonasfschuh.kotlin_avengers_api.resource.avenger

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import io.github.jonasfschuh.kotlin_avengers_api.domain.avenger.Avenger;
import io.github.jonasfschuh.kotlin_avengers_api.domain.avenger.AvengerRepository
import org.springframework.data.repository.findByIdOrNull

@Component
class AvengerRepositoryImpl (
    @Autowired
    private val repository: AvengerEntityRepository
) : AvengerRepository {
    override fun getDetail(id: Long): Avenger? =
        repository.findByIdOrNull(id)?.toAvenger()

    override fun getAvengers(): List<Avenger> =
        repository.findAll().map { it.toAvenger() }

    override fun create(avenger: Avenger): Avenger =
        repository.save(AvengerEntity.from(avenger)).toAvenger()

    override fun delete(id: Long) =
        repository.deleteById(id)

    override fun update(avenger: Avenger): Avenger =
        repository.save(AvengerEntity.from(avenger)).toAvenger()
}