package com.moj.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lawyer")
public class Lawyer {
	
	@Id @GeneratedValue
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
	
	private String[] fax;
	private String[] email;
	private String[] website;
	private String degree;
	private String office;
	private String other;
	private String image;
	
	@Column(name = "current_status")
	private String currentStatus;
	
	@ManyToOne(cascade=CascadeType.ALL)
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
}
