package pl.coderslab.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class Children {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 3)
	private String firstName;

	@Size(min = 3)
	private String lastName;

	@ManyToOne(cascade = { /*CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH,*/ CascadeType.REMOVE})
//	@JoinColumn(name="teacher_id")
	private Teacher teacher;

	@ManyToMany(mappedBy = "childrens")//(cascade = { CascadeType.ALL/*, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE*/})
	private List<Parent> parents;

	@ManyToOne
	private Paymant payments;

	public Children() {
		super();
	}

	public Children(String firstName, String lastName, Teacher teacher, List<Parent> parents, Paymant payments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacher = teacher;
		this.parents = parents;
		this.payments = payments;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Parent> getParents() {
		return parents;
	}

	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}

	public Paymant getPayments() {
		return payments;
	}

	public void setPayments(Paymant payments) {
		this.payments = payments;
	}

	public Long getId() {
		return id;
	}

}
