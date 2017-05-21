package by.dt.service.impl;

import by.dt.client.BoaoPromtorgClient;
import by.dt.entity.from.generalstorage.CategoryWrapper;
import by.dt.entity.to.ui.CategoryDTO;
import by.dt.service.CategoryService;
import by.dt.util.constants.UrlClientConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final BoaoPromtorgClient boaoPromtorgClient;

    @Autowired
    public CategoryServiceImpl(BoaoPromtorgClient boaoPromtorgClient) {
        this.boaoPromtorgClient = boaoPromtorgClient;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        ResponseEntity<Object> response = boaoPromtorgClient.send(UrlClientConstants.BOAO_PROMTORG.GET_ALL_CATEGORIES);
        if (response != null) {
            List<CategoryWrapper> categoryWrappers = (List<CategoryWrapper>) response.getBody();
            categoryWrappers.forEach(item -> categoryDTOS.add(new CategoryDTO(item.getId(), item.getName(), item.getParentCategoryId())));
        }
        return categoryDTOS;
    }
}
