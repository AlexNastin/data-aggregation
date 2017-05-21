package by.dt.controller;

import by.dt.entity.to.ui.CategoryDTO;
import by.dt.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/data-aggregation/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation(value = "CategoryDTO search", notes = "Return a list of categories", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
