package pe.com.bn.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotBlank
	@Email
	private String username;
	
	@NotEmpty
	@Pattern(regexp="[0-9]{8}")
	private String dni;
	
	@NotBlank
	@Size(min = 3, max = 5)
	private String password;
	
	public User() {
	}

	public User(String username, String dni, String password) {
		this.username = username;
		this.dni = dni;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}