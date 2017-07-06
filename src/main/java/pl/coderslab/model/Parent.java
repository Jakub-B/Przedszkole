package pl.coderslab.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Parent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;
	@NotBlank
	private String login;
	@NotBlank
	@Size(min = 8)
	private String password;
	@NotBlank
	@Email
	private String email;

	@NotBlank
	private Long phoneNumber;

	@NotBlank
	private Long secondPhoneNumber;

	@NotBlank
	private String address;

	@ManyToMany
	List<Children> childrens;

	public Parent() {
		super();
	}

	public Parent(String firstName, String lastName, String login, String password, String email, Long phoneNumber,
			Long secondPhoneNumber, String address, List<Children> children) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.secondPhoneNumber = secondPhoneNumber;
		this.address = address;
		this.childrens = children;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getSecondPhoneNumber() {
		return secondPhoneNumber;
	}

	public void setSecondPhoneNumber(Long secondPhoneNumber) {
		this.secondPhoneNumber = secondPhoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Children> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Children> childrens) {
		this.childrens = childrens;
	}

	public Long getId() {
		return id;
	}

}
