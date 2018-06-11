package factory;

public class PlanFactory {
	public static Plan getPlan(String name) {
		if (name == null) {
			return null;
		}
		switch (name) {
		case "PROFESSIONAL":
			return new ProfessionalPlan();
		case "HOME":
			return new HomePlan();
		default:
			return null;
		}

	}

}
