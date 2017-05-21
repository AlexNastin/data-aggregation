package by.dt.entity.from.generalstorage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "Category of product")
public class CategoryWrapper {

    @ApiModelProperty(value = "Unique id")
    private String id;

    @ApiModelProperty(value = "Имя категории")
    private String name;

    @ApiModelProperty(value = "Id родительской категории")
    private String parentCategoryId;

    public CategoryWrapper() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryWrapper that = (CategoryWrapper) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(parentCategoryId, that.parentCategoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentCategoryId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CategoryWrapper{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", parentCategoryId='").append(parentCategoryId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
