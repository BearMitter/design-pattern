package factory;

public class Main {

	public static void main(String[] args) {
		Plan plan = PlanFactory.getPlan("HOME");
		System.out.println(plan.getFee(5));
		Plan planB = PlanFactory.getPlan("PROFESSIONAL");
		System.out.println(planB.getFee(5));
	}

}
