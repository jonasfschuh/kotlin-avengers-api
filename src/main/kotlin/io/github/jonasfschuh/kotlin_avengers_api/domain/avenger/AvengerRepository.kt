package io.github.jonasfschuh.kotlin_avengers_api.domain.avenger

interface AvengerRepository {
    fun getDetail(id: Long): Avenger?;
    fun getAvengers(): List<Avenger>;
    fun create(avenger: Avenger): Avenger
    fun delete(id: Long)
    fun update(avenger: Avenger): Avenger
}