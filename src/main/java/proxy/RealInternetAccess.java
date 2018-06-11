package proxy;

public class RealInternetAccess implements OfficeInternetAccess {
	String employeeName;

	public RealInternetAccess(String empName) {

		this.employeeName = empName;

	}

	@Override
	public void grantInternetAccess() {

		System.out.println("Internet Accesss granted for employee: " + employeeName);
	}

}
