package by.dt.entity.to.ui;

import by.dt.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "Shop (Server)")
public class ShopDTO implements Entity {

    @ApiModelProperty(value = "Unique shop id")
    private Long id;

    @ApiModelProperty(value = "Name of shop")
    private String name;

    @ApiModelProperty(value = "Coordinate X")
    private String coordinateX;

    @ApiModelProperty(value = "Coordinate Y")
    private String coordinateY;

    public ShopDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopDTO that = (ShopDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(coordinateX, that.coordinateX) &&
                Objects.equals(coordinateY, that.coordinateY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShopDTO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", coordinateX='").append(coordinateX).append('\'');
        sb.append(", coordinateY='").append(coordinateY).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
