package by.dt.entity.to.ui;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

@ApiModel(value = "User loyalty card (Server)")
public class CustomerCardDTO implements Serializable {

    @ApiModelProperty(value = "Unique card id")
    private Long id;

    @ApiModelProperty(value = "Id of the card in the trading networks")
    private Long cardId;

    @ApiModelProperty(value = "Id of the trading network")
    private Long tradingNetworkId;

    public CustomerCardDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getTradingNetworkId() {
        return tradingNetworkId;
    }

    public void setTradingNetworkId(Long tradingNetworkId) {
        this.tradingNetworkId = tradingNetworkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCardDTO that = (CustomerCardDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(cardId, that.cardId) &&
                Objects.equals(tradingNetworkId, that.tradingNetworkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardId, tradingNetworkId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerCardDTO{");
        sb.append("id=").append(id);
        sb.append(", cardId=").append(cardId);
        sb.append(", tradingNetworkId=").append(tradingNetworkId);
        sb.append('}');
        return sb.toString();
    }
}
