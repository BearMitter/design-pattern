package proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

	String employeeName;
	RealInternetAccess realAccess;

	public ProxyInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realAccess = new RealInternetAccess(employeeName);
			realAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}

	}

	public int getRole(String emplName) {
		return 3;
	}

}
