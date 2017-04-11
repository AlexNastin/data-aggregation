package by.dt.entity.from.ui;

import by.dt.util.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

@ApiModel(value = "User (Client)", description = "User data when the settings are changed")
public class UserWrapper implements Serializable {

    @JsonProperty(required = true)
    @ApiModelProperty(value = "Login", required = true, example = "John_Smith")
    private String login;

    @ApiModelProperty(value = "Name of user", example = "John")
    private String name;

    @ApiModelProperty(value = "Last name of user", example = "Smith")
    private String surname;

    @ApiModelProperty(value = "Date of birth")
    private String birthday;

    @ApiModelProperty(value = "Sex")
    private Gender gender;

    @ApiModelProperty(value = "E-mail", example = "John_Smith@gmail.com")
    private String email;

    @ApiModelProperty(value = "Phone number", example = "375291234567")
    private String numberPhone;

    @ApiModelProperty(value = "Coordinate X", example = "53.875114")
    private String coordinateX;

    @ApiModelProperty(value = "Coordinate Y", example = "27.498202")
    private String coordinateY;

    @ApiModelProperty(value = "User settings")
    private UserSettingsWrapper userSettings;

    public UserWrapper() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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

    public UserSettingsWrapper getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettingsWrapper userSettings) {
        this.userSettings = userSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserWrapper that = (UserWrapper) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(birthday, that.birthday) &&
                gender == that.gender &&
                Objects.equals(email, that.email) &&
                Objects.equals(numberPhone, that.numberPhone) &&
                Objects.equals(coordinateX, that.coordinateX) &&
                Objects.equals(coordinateY, that.coordinateY) &&
                Objects.equals(userSettings, that.userSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, surname, birthday, gender, email, numberPhone, coordinateX, coordinateY, userSettings);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserWrapper{");
        sb.append("login='").append(login).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", email='").append(email).append('\'');
        sb.append(", numberPhone='").append(numberPhone).append('\'');
        sb.append(", coordinateX='").append(coordinateX).append('\'');
        sb.append(", coordinateY='").append(coordinateY).append('\'');
        sb.append(", userSettings=").append(userSettings);
        sb.append('}');
        return sb.toString();
    }
}
