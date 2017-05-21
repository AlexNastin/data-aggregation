package by.dt.entity.from.ui;

import by.dt.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "User loyalty card (Client)")
public class CustomerCardWrapper implements Entity {

    @ApiModelProperty(value = "Id of the card in the trading networks")
    private Long cardId;

    @ApiModelProperty(value = "Id of the trading network")
    private Long tradingNetworkId;

    public CustomerCardWrapper() {
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
        CustomerCardWrapper that = (CustomerCardWrapper) o;
        return Objects.equals(cardId, that.cardId) &&
                Objects.equals(tradingNetworkId, that.tradingNetworkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, tradingNetworkId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerCardWrapper{");
        sb.append("cardId=").append(cardId);
        sb.append(", tradingNetworkId=").append(tradingNetworkId);
        sb.append('}');
        return sb.toString();
    }
}
