package by.dt.entity.to.ui;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@ApiModel(value = "Product (Server)")
public class ProductDTO implements Serializable {

    @ApiModelProperty(value = "Barcode")
    private String barcode;

    @ApiModelProperty(value = "Name of product")
    private String name;

    @ApiModelProperty(value = "Id of the trading network")
    private Long tradingNetworkId;

    @ApiModelProperty(value = "Unit of measurement")
    private String typeUnit;

    @ApiModelProperty(value = "Price per item")
    private Double priceUnit;

    @ApiModelProperty(value = "Producer of product")
    private String producer;

    @ApiModelProperty(value = "Country of origin")
    private String country;

    @ApiModelProperty(value = "List of stores in which this product is present")
    private List<ShopDTO> shopDTOS;

    @ApiModelProperty(value = "Category of product")
    private String category;

    public ProductDTO() {
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTradingNetworkId() {
        return tradingNetworkId;
    }

    public void setTradingNetworkId(Long tradingNetworkId) {
        this.tradingNetworkId = tradingNetworkId;
    }

    public String getTypeUnit() {
        return typeUnit;
    }

    public void setTypeUnit(String typeUnit) {
        this.typeUnit = typeUnit;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<ShopDTO> getShopDTOS() {
        return shopDTOS;
    }

    public void setShopDTOS(List<ShopDTO> shopDTOS) {
        this.shopDTOS = shopDTOS;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals(barcode, that.barcode) &&
                Objects.equals(name, that.name) &&
                Objects.equals(tradingNetworkId, that.tradingNetworkId) &&
                Objects.equals(typeUnit, that.typeUnit) &&
                Objects.equals(priceUnit, that.priceUnit) &&
                Objects.equals(producer, that.producer) &&
                Objects.equals(country, that.country) &&
                Objects.equals(shopDTOS, that.shopDTOS) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, name, tradingNetworkId, typeUnit, priceUnit, producer, country, shopDTOS, category);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductDTO{");
        sb.append("barcode='").append(barcode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", tradingNetworkId=").append(tradingNetworkId);
        sb.append(", typeUnit='").append(typeUnit).append('\'');
        sb.append(", priceUnit=").append(priceUnit);
        sb.append(", producer='").append(producer).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", shopDTOS=").append(shopDTOS);
        sb.append(", category='").append(category).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
