package factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		try {
			IT it=new IT(846,"heloo");
			
			Account acc=new Account();
			acc.setSerialNo(684);
			acc.setAccountName("computer");
			
			
			
		Department department=new Department();
		department.setDepartmentName(acc.getAccountName());
		department.setEmplyoeeName("harsh v");
		department.setPhoneNo(98956248);
		
		EmployeeDetail empDetail=new EmployeeDetail();
		empDetail.setEmployeeAdd("hatfw hbsjb");
		empDetail.setEmployName(department.getEmplyoeeName());
		empDetail.setGender("male");
		empDetail.setPhoneNo(department.getPhoneNo());
		
		System.out.println("Department Details : "+ department);
		System.out.println("IT : "+ it);
		System.out.println("acoount : "+ acc);
		System.out.println("emplyoee detail : "+empDetail);

		
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
