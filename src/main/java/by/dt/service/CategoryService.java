package by.dt.service;

import by.dt.entity.to.ui.CategoryDTO;

import java.util.List;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();
}
