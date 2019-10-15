package chucknorrissendssms.com.app;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class SMS {
	@NotBlank(message="The recipient's name is required")
	@Size(max=30, message="Your name can't be longer than 30 characters")
	private String toName;

	@NotBlank(message="Your name is required")
	@Size(max=30, message="Recipient's name can't be longer than 30 characters")
	private String fromName;
	
	@Size(min=10, max=10, message="This must be a 10 digits phone number")
	private String phoneNumber;
	
	@Size(max=30, message="Firstname can't be longer than 30 characters")
	private String firstname;

	@Size(max=30, message="Lastname can't be longer than 30 characters")
	private String lastname;
	private boolean female = false ;
	private boolean explicit = false;
	private boolean nerdy = false;
		
	public boolean isNerdy() {
		return nerdy;
	}
	public void setNerdy(boolean nerdy) {
		this.nerdy = nerdy;
	}
	public boolean isExplicit() {
		return explicit;
	}
	public void setExplicit(boolean explicit) {
		this.explicit = explicit;
	}
	public boolean isFemale() {
		return female;
	}
	public void setFemale(boolean female) {
		this.female = female;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getFromName() {
		return fromName;
	}
	public void setFromName(String fromName) {
		this.fromName = fromName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
