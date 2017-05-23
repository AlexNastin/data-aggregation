package by.dt.entity.to.ui;

import by.dt.entity.Entity;
import by.dt.util.enums.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "User settings (Server)")
public class UserSettingsDTO implements Entity {

    @ApiModelProperty(value = "List of id user loyalty cards")
    private List<String> customerCards;

    @ApiModelProperty(value = "List of id of interesting users of trading networks")
    private List<String> interestedTradingNetworkIds;

    @ApiModelProperty(value = "Notification settings")
    private NotificationDTO notification;

    @ApiModelProperty(value = "List of id of interesting users of categories")
    private List<String> interestedCategoryIds;

    @ApiModelProperty(value = "Default location for search")
    private Location locationMode;

    public UserSettingsDTO() {
    }

    public List<String> getCustomerCards() {
        return customerCards;
    }

    public void setCustomerCards(List<String> customerCards) {
        this.customerCards = customerCards;
    }

    public List<String> getInterestedTradingNetworkIds() {
        return interestedTradingNetworkIds;
    }

    public void setInterestedTradingNetworkIds(List<String> interestedTradingNetworkIds) {
        this.interestedTradingNetworkIds = interestedTradingNetworkIds;
    }

    public NotificationDTO getNotification() {
        return notification;
    }

    public void setNotification(NotificationDTO notification) {
        this.notification = notification;
    }

    public List<String> getInterestedCategoryIds() {
        return interestedCategoryIds;
    }

    public void setInterestedCategoryIds(List<String> interestedCategoryIds) {
        this.interestedCategoryIds = interestedCategoryIds;
    }

    public Location getLocationMode() {
        return locationMode;
    }

    public void setLocationMode(Location locationMode) {
        this.locationMode = locationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserSettingsDTO)) return false;
        UserSettingsDTO that = (UserSettingsDTO) o;
        return Objects.equals(customerCards, that.customerCards) &&
                Objects.equals(interestedTradingNetworkIds, that.interestedTradingNetworkIds) &&
                Objects.equals(notification, that.notification) &&
                Objects.equals(interestedCategoryIds, that.interestedCategoryIds) &&
                locationMode == that.locationMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCards, interestedTradingNetworkIds, notification, interestedCategoryIds, locationMode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserSettingsDTO{");
        sb.append("customerCards=").append(customerCards);
        sb.append(", interestedTradingNetworkIds=").append(interestedTradingNetworkIds);
        sb.append(", notification=").append(notification);
        sb.append(", interestedCategoryIds=").append(interestedCategoryIds);
        sb.append(", locationMode=").append(locationMode);
        sb.append('}');
        return sb.toString();
    }
}
