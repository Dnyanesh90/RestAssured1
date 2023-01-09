package Tutorial7;

public class CreateEmployee {

	private String FirstName;
	private String LastName;
	private String Address;
	private String Job;
	
	public CreateEmployee()
	{
		
	}
	
	
	public CreateEmployee(String firstName, String lastName, String address, String job) {
	
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		Job = job;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	
	@Override
	public String toString() {
		return "CreateEmployee [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", Job="
				+ Job + "]";
	}



}