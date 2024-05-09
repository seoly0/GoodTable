package me.seoly.goodtable.repository

import me.seoly.goodtable.core.model.entity.MenuCategoryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MenuCategoryRepository: JpaRepository<MenuCategoryEntity, Long> {

    fun findAllByStoreId(storeId: Long): List<MenuCategoryEntity>
}