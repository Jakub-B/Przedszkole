package pl.coderslab.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(unique=true)
	private String login;
	@NotNull
	@Size(min = 8)
	private String password;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	@Email
	private String email;

	
	private String phoneNumber;

	
	private String secondPhoneNumber;

	@OneToMany(mappedBy="teacher", cascade = {CascadeType.ALL})
//	@JoinColumn(name="teacher_id")
	private List<Children> childrens;


	public Teacher() {
		super();
	}


	public Teacher(String login, String password, String firstName, String lastName, String email, String phoneNumber,
			String secondPhoneNumber, List<Children> childrens) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.secondPhoneNumber = secondPhoneNumber;
		this.childrens = childrens;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getSecondPhoneNumber() {
		return secondPhoneNumber;
	}


	public void setSecondPhoneNumber(String secondPhoneNumber) {
		this.secondPhoneNumber = secondPhoneNumber;
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
