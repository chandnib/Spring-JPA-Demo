package edu.sjsu.cmpe275.lab2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Override
	public String toString()
	{
		return "Profile [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", address=" + address + ", organization=" + organization + ", aboutMyself=" + aboutMyself + "]";
	}

	@Column(name = "first_name")
	private String firstname;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "organization")
	private String organization;
	@Column(name = "about_me")
	private String aboutMyself;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getOrganization()
	{
		return organization;
	}

	public void setOrganization(String organization)
	{
		this.organization = organization;
	}

	public String getAboutMyself()
	{
		return aboutMyself;
	}

	public void setAboutMyself(String aboutMyself)
	{
		this.aboutMyself = aboutMyself;
	}

}
