package com.sonika.InventoryMgtSystem.repositories;

import com.sonika.InventoryMgtSystem.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
