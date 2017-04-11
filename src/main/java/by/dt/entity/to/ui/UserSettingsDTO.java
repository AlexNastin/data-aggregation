package by.dt.entity.to.ui;

import by.dt.util.enums.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@ApiModel(value = "User settings (Server)")
public class UserSettingsDTO implements Serializable {

    @ApiModelProperty(value = "List of user loyalty cards")
    private Set<CustomerCardDTO> customerCardDTOS;

    @ApiModelProperty(value = "List of id of interesting users of trading networks")
    private Set<Long> interestedTradingNetworkIds;

    @ApiModelProperty(value = "Need to send notifications to the user (true/false)")
    private boolean sendNotification;

    @ApiModelProperty(value = "Default location for search")
    private Location locationMode;

    public UserSettingsDTO() {
    }

    public Set<CustomerCardDTO> getCustomerCardDTOS() {
        return customerCardDTOS;
    }

    public void setCustomerCardDTOS(Set<CustomerCardDTO> customerCardDTOS) {
        this.customerCardDTOS = customerCardDTOS;
    }

    public Set<Long> getInterestedTradingNetworkIds() {
        return interestedTradingNetworkIds;
    }

    public void setInterestedTradingNetworkIds(Set<Long> interestedTradingNetworkIds) {
        this.interestedTradingNetworkIds = interestedTradingNetworkIds;
    }

    public boolean isSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
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
        if (o == null || getClass() != o.getClass()) return false;
        UserSettingsDTO that = (UserSettingsDTO) o;
        return sendNotification == that.sendNotification &&
                Objects.equals(customerCardDTOS, that.customerCardDTOS) &&
                Objects.equals(interestedTradingNetworkIds, that.interestedTradingNetworkIds) &&
                locationMode == that.locationMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCardDTOS, interestedTradingNetworkIds, sendNotification, locationMode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserSettingsDTO{");
        sb.append("customerCardDTOS=").append(customerCardDTOS);
        sb.append(", interestedTradingNetworkIds=").append(interestedTradingNetworkIds);
        sb.append(", sendNotification=").append(sendNotification);
        sb.append(", locationMode=").append(locationMode);
        sb.append('}');
        return sb.toString();
    }
}
