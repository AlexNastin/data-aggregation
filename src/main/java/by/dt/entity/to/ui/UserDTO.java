package by.dt.entity.to.ui;

import by.dt.entity.Entity;
import by.dt.util.LocalDateDeserializer;
import by.dt.util.LocalDateSerializer;
import by.dt.util.enums.Gender;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "UserDTO (Server)", description = "A user object that includes user settings")
public class UserDTO implements Entity {

    @ApiModelProperty(value = "Unique user id")
    private Long id;

    @ApiModelProperty(value = "Login", required = true, example = "John_Smith")
    private String login;

    @ApiModelProperty(value = "Password")
    private String password;

    @ApiModelProperty(value = "Name of user", example = "John")
    private String name;

    @ApiModelProperty(value = "Last name of user", example = "Smith")
    private String surname;

    @ApiModelProperty(value = "Date of birth")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate birthday;

    @ApiModelProperty(value = "Sex")
    private Gender gender;

    @ApiModelProperty(value = "E-mail", example = "John_Smith@gmail.com")
    private String email;

    @ApiModelProperty(value = "Phone number", example = "375291234567")
    private String numberPhone;

    @ApiModelProperty(value = "User`s address")
    private String address;

    @ApiModelProperty(value = "Coordinate X", example = "53.875114")
    private String coordinateX;

    @ApiModelProperty(value = "Coordinate Y", example = "27.498202")
    private String coordinateY;

    @ApiModelProperty(value = "User settings")
    private UserSettingsDTO userSettings;

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public UserSettingsDTO getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettingsDTO userSettings) {
        this.userSettings = userSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDTO)) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id) &&
                Objects.equals(login, userDTO.login) &&
                Objects.equals(password, userDTO.password) &&
                Objects.equals(name, userDTO.name) &&
                Objects.equals(surname, userDTO.surname) &&
                Objects.equals(birthday, userDTO.birthday) &&
                gender == userDTO.gender &&
                Objects.equals(email, userDTO.email) &&
                Objects.equals(numberPhone, userDTO.numberPhone) &&
                Objects.equals(address, userDTO.address) &&
                Objects.equals(coordinateX, userDTO.coordinateX) &&
                Objects.equals(coordinateY, userDTO.coordinateY) &&
                Objects.equals(userSettings, userDTO.userSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, name, surname, birthday, gender, email, numberPhone, address, coordinateX, coordinateY, userSettings);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDTO{");
        sb.append("id=").append(id);
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", email='").append(email).append('\'');
        sb.append(", numberPhone='").append(numberPhone).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", coordinateX='").append(coordinateX).append('\'');
        sb.append(", coordinateY='").append(coordinateY).append('\'');
        sb.append(", userSettings=").append(userSettings);
        sb.append('}');
        return sb.toString();
    }
}
