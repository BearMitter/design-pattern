package decorator;

public class Main {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		circle.draw();
		redCircle.draw();

		Shape rectangle = new Rectangle();
		Shape redRectangle = new RedShapeDecorator(rectangle);
		rectangle.draw();
		redRectangle.draw();
	}
}
