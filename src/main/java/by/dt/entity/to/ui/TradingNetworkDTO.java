package by.dt.entity.to.ui;

import by.dt.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "Trading network (Server)")
public class TradingNetworkDTO implements Entity {

    @ApiModelProperty(value = "Unique trading network id")
    private Long id;

    @ApiModelProperty(value = "Name of trading network")
    private String name;

    public TradingNetworkDTO() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradingNetworkDTO that = (TradingNetworkDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradingNetworkDTO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
