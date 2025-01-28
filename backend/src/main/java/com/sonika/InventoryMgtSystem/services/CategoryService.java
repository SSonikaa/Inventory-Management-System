package com.sonika.InventoryMgtSystem.services;

import com.sonika.InventoryMgtSystem.dtos.CategoryDTO;
import com.sonika.InventoryMgtSystem.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
