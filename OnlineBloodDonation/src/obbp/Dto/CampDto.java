package obbp.Dto;

public class CampDto {

	String regid,campname,location,Email;
	int status;

	

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRegid() {
		return regid;
	}

	public void setRegid(String regid) {
		this.regid = regid;
	}

	public String getCampname() {
		return campname;
	}

	public void setCampname(String campname) {
		this.campname = campname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
