package factory;

public abstract class Plan {
	double price;

	double getFee(int unit) {
		return price * unit;
	}
}
