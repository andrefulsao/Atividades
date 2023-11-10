package ABStrackfactory;

public class RedRectangle extends Rectangle {
	
	public RedRectangle(float base) {
		super(base, "RED");
	}
	
	public void draw() {
		System.out.println("Dentro de Quadrado" + getColor() + "de altura" + getBase() + "no método draw()");
	}

}
