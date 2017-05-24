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

    @ApiModelProperty(value = "Personal data of user")
    private PersonalSettingsDTO personalSettings;

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

    public PersonalSettingsDTO getPersonalSettings() {
        return personalSettings;
    }

    public void setPersonalSettings(PersonalSettingsDTO personalSettings) {
        this.personalSettings = personalSettings;
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
                Objects.equals(personalSettings, userDTO.personalSettings) &&
                Objects.equals(userSettings, userDTO.userSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, personalSettings, userSettings);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDTO{");
        sb.append("id=").append(id);
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", personalSettings=").append(personalSettings);
        sb.append(", userSettings=").append(userSettings);
        sb.append('}');
        return sb.toString();
    }
}
