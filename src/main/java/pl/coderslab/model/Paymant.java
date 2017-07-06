package pl.coderslab.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paymant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Title;
	
	private double value;
	
	@OneToMany(mappedBy="payments")
	private List<Children> children;

	public Paymant() {
		super();
	}

	public Paymant(String title, double value, List<Children> children) {
		super();
		Title = title;
		this.value = value;
		this.children = children;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public List<Children> getChildren() {
		return children;
	}

	public void setChildren(List<Children> children) {
		this.children = children;
	}

	public Long getId() {
		return id;
	}

	
	
}
