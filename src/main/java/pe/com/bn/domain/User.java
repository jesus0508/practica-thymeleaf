package pe.com.bn.domain;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

    @NotBlank
    @Pattern(regexp = "[0-9]{8}")
    private String dni;

    @NotBlank
    private String firstname;

    @NotBlank
    private String surname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;

    private Country country;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 3)
    private String password;

    public User() {
    }

    public User(String dni, String firstname, String surname, Date birthdate, Country country, String email,
            String password) {
        this.dni = dni;
        this.firstname = firstname;
        this.surname = surname;
        this.birthdate = birthdate;
        this.country = country;
        this.email = email;
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}