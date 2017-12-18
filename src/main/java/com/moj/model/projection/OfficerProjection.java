package com.moj.model.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.moj.model.Officer;
import com.moj.model.Position;

@Projection(name = "position", types = Officer.class)
public interface OfficerProjection {

	public Integer getId();

	public String getKhName();

	public String getEnName();

	public Date getDateOfBirth();

	public String getPlaceOfBirth();

	public String[] getPhoneNumber();

	public void setFax(String[] fax);

	public String[] getEmail();

	public String[] getWebsite();

	public String getDegree();

	public String getOffice();

	public String getOther();

	public String getImage();

	public String getCurrentStatus();

	public Position getPosition();

}
