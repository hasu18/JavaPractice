package factory;

public class Department {
	
	private IT it;
	public IT getIt() {
		return it;
	}
	public void setIt(IT it) {
		this.it = it;
	}
	private String departmentName;
	private String emplyoeeName;
	private int phoneNo;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmplyoeeName() {
		return emplyoeeName;
	}
	public void setEmplyoeeName(String emplyoeeName) {
		this.emplyoeeName = emplyoeeName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", emplyoeeName=" + emplyoeeName + ", phoneNo="
				+ phoneNo + "]";
	}
	
	
	
	
}
