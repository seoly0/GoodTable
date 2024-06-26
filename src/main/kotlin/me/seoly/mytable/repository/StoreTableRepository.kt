package me.seoly.mytable.repository

import me.seoly.mytable.core.model.entity.StoreTableEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StoreTableRepository: JpaRepository<StoreTableEntity, Long> {

    fun findAllByStoreId(storeId: Long): List<StoreTableEntity>
    fun findByIdAndStoreId(id: Long, storeId: Long): StoreTableEntity?
//    fun findBy
}