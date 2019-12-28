package obbp.Dto;

public class DonorDto {

	String donor_id,donor_name,blood_type,location,last_blood_donate_date,email;
	int age,status;
	long contact_no;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getDonor_id() {
		return donor_id;
	}
	public void setDonor_id(String donor_id) {
		this.donor_id = donor_id;
	}
	public String getDonor_name() {
		return donor_name;
	}
	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}
	public String getBlood_type() {
		return blood_type;
	}
	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLast_blood_donate_date() {
		return last_blood_donate_date;
	}
	public void setLast_blood_donate_date(String last_blood_donate_date) {
		this.last_blood_donate_date = last_blood_donate_date;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
