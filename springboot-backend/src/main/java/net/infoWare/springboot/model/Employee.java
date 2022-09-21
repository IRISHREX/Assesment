package net.infoWare.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", jobTitle=" + jobTitle
				+ ", emailId=" + emailId + ", Adress=" + Adress + ", City=" + City + ", State=" + State
				+ ", primaryEmergebcyContact=" + primaryEmergebcyContact + ", phoneNumber=" + phoneNumber
				+ ", RelationShip=" + RelationShip + ", secondary_emergebcy_contact=" + secondary_emergebcy_contact
				+ ", phoneNumber2=" + phoneNumber2 + ", RelationShip2=" + RelationShip2 + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPrimaryEmergebcyContact() {
		return primaryEmergebcyContact;
	}
	public void setPrimaryEmergebcyContact(String primaryEmergebcyContact) {
		this.primaryEmergebcyContact = primaryEmergebcyContact;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRelationShip() {
		return RelationShip;
	}
	public void setRelationShip(String relationShip) {
		RelationShip = relationShip;
	}
	public String getSecondary_emergebcy_contact() {
		return secondary_emergebcy_contact;
	}
	public void setSecondary_emergebcy_contact(String secondary_emergebcy_contact) {
		this.secondary_emergebcy_contact = secondary_emergebcy_contact;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	public String getRelationShip2() {
		return RelationShip2;
	}
	public void setRelationShip2(String relationShip2) {
		RelationShip2 = relationShip2;
	}
	public Employee(long id, String firstName, String lastName, String jobTitle, String emailId, String adress,
			String city, String state, String primaryEmergebcyContact, String phoneNumber, String relationShip,
			String secondary_emergebcy_contact, String phoneNumber2, String relationShip2) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.emailId = emailId;
		Adress = adress;
		City = city;
		State = state;
		this.primaryEmergebcyContact = primaryEmergebcyContact;
		this.phoneNumber = phoneNumber;
		RelationShip = relationShip;
		this.secondary_emergebcy_contact = secondary_emergebcy_contact;
		this.phoneNumber2 = phoneNumber2;
		RelationShip2 = relationShip2;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "job_title")
	private String jobTitle;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "adress")
	private String Adress;
	@Column(name = "city")
	private String City;
	@Column(name = "state")
	private String State;
	@Column(name = "primary_emergebcy_contact")
	private String primaryEmergebcyContact;
	@Column(name = "phone_Number")
	private String phoneNumber;
	@Column(name = "relationShip")
	private String RelationShip;
	@Column(name = "secondaryEmergebcyContact")
	private String secondary_emergebcy_contact;
	@Column(name = "phone_Number2")
	private String phoneNumber2;
	@Column(name = "Relation_Ship2")
	private String RelationShip2;
	}
