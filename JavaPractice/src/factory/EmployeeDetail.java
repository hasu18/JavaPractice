package factory;

public class EmployeeDetail {
	private String employName;
	private String employeeAdd;
	private int phoneNo;
	private String gender;
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public String getEmployeeAdd() {
		return employeeAdd;
	}
	public void setEmployeeAdd(String employeeAdd) {
		this.employeeAdd = employeeAdd;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "EmployeeDetail [employName=" + employName + ", employeeAdd=" + employeeAdd + ", phoneNo=" + phoneNo
				+ ", gender=" + gender + "]";
	}
	
	
}
