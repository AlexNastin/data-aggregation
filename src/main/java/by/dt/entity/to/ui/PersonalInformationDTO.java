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

@ApiModel(value = "Personal information of user")
public class PersonalInformationDTO implements Entity {

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

    public PersonalInformationDTO() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalInformationDTO)) return false;
        PersonalInformationDTO that = (PersonalInformationDTO) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(birthday, that.birthday) &&
                gender == that.gender &&
                Objects.equals(email, that.email) &&
                Objects.equals(numberPhone, that.numberPhone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(coordinateX, that.coordinateX) &&
                Objects.equals(coordinateY, that.coordinateY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday, gender, email, numberPhone, address, coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalInformationDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", email='").append(email).append('\'');
        sb.append(", numberPhone='").append(numberPhone).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", coordinateX='").append(coordinateX).append('\'');
        sb.append(", coordinateY='").append(coordinateY).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
