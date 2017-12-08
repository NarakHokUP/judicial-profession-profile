package com.moj.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "officer")
public class Officer {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "kh_name")
	private String khName;

	@Column(name = "en_name")
	private String enName;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "place_of_birth")
	private String placeOfBirth;

	@Column(name = "phone_number")
	private String[] phoneNumber;

	@Column(name = "fax")
	private String[] fax;
	
	@Column(name = "email")
	private String[] email;
	
	@Column(name = "website")
	private String[] website;
	
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "office")
	private String office;
	
	@Column(name = "other")
	private String other;
	
	@Column(name = "image")
	private String image;

	@Column(name = "current_status")
	private String currentStatus;

	@ManyToOne
	@JoinColumn(name = "position_id")
	private Position position;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKhName() {
		return khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String[] getFax() {
		return fax;
	}

	public void setFax(String[] fax) {
		this.fax = fax;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getWebsite() {
		return website;
	}

	public void setWebsite(String[] website) {
		this.website = website;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Officer [id=" + id + ", khName=" + khName + ", enName=" + enName + ", dateOfBirth=" + dateOfBirth
				+ ", placeOfBirth=" + placeOfBirth + ", phoneNumber=" + Arrays.toString(phoneNumber) + ", fax="
				+ Arrays.toString(fax) + ", email=" + Arrays.toString(email) + ", website=" + Arrays.toString(website)
				+ ", degree=" + degree + ", office=" + office + ", other=" + other + ", image=" + image
				+ ", currentStatus=" + currentStatus + "]";
	}
}
