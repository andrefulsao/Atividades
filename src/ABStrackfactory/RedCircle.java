package ABStrackfactory;

public class RedCircle extends Circle {
	
	public RedCircle (float ray) {
		super(ray, "RED");
	}
	
	public void draw() {
		System.out.println("Dentro de Quadrado" + getColor() + "de altura" + getRay() + "no método draw()");
	}

}
