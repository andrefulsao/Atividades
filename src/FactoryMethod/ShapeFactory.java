package FactoryMethod;

public class ShapeFactory {
	//Use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}	
}
