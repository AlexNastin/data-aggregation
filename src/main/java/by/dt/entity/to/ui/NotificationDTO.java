package by.dt.entity.to.ui;

import by.dt.entity.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel("Notification settings")
public class NotificationDTO implements Entity {

    @ApiModelProperty(value = "General setting. On or off notifications")
    private boolean sendNotification;

    @ApiModelProperty(value = "On or off push-notification")
    private boolean sendPush;

    @ApiModelProperty(value = "On or off email-notification")
    private boolean sendEmail;

    @ApiModelProperty(value = "On or off sms-notification")
    private boolean sendSMS;

    public NotificationDTO() {
    }

    public boolean isSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
    }

    public boolean isSendPush() {
        return sendPush;
    }

    public void setSendPush(boolean sendPush) {
        this.sendPush = sendPush;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean isSendSMS() {
        return sendSMS;
    }

    public void setSendSMS(boolean sendSMS) {
        this.sendSMS = sendSMS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotificationDTO)) return false;
        NotificationDTO that = (NotificationDTO) o;
        return sendNotification == that.sendNotification &&
                sendPush == that.sendPush &&
                sendEmail == that.sendEmail &&
                sendSMS == that.sendSMS;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendNotification, sendPush, sendEmail, sendSMS);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotificationDTO{");
        sb.append("sendNotification=").append(sendNotification);
        sb.append(", sendPush=").append(sendPush);
        sb.append(", sendEmail=").append(sendEmail);
        sb.append(", sendSMS=").append(sendSMS);
        sb.append('}');
        return sb.toString();
    }
}
