package factory;

public class IT {
	
	private int SerialNo;
	private String name;
	
	public IT(int SerialNo, String name) 
	{
		super();
		this.SerialNo = SerialNo;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "IT [SerialNo=" + SerialNo + ", name=" + name + "]";
	}
	
	
}
