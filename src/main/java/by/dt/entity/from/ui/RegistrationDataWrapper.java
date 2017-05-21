package by.dt.entity.from.ui;

import by.dt.entity.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * @author Stepanov Nickita on 21.05.2017.
 * @version 1.0
 */
@ApiModel(value = "Registration data (Client)", description = "User information at the time of registration or authorization")
public class RegistrationDataWrapper implements Entity {

    @ApiModelProperty(value = "Login", required = true, example = "John_Smith")
    @JsonProperty(required = true)
    private String login;

    @ApiModelProperty(value = "Password", required = true)
    @JsonProperty(required = true)
    private String password;

    public RegistrationDataWrapper() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationDataWrapper that = (RegistrationDataWrapper) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegistrationDataWrapper{");
        sb.append("login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
