package ABStrackfactory;

public class Principal {
	
	public static void main (String[] args) {
		AbstractFactory shapeBlueFactory = FactoryProducer.getFactory("BLUE");
		
		Shape shape1 = shapeBlueFactory.getCircle(1);
		shape1.draw();
		
		Shape shape2 = shapeBlueFactory.getRectangle(2);
		shape2.draw();
		
		Shape shape3 = shapeBlueFactory.getSquare(3);
		shape3.draw();
		
		AbstractFactory shapeRedFactory = FactoryProducer.getFactory("RED");
		
		Shape shape4 = shapeRedFactory.getCircle(4);
		shape4.draw();
		
		Shape shape5 = shapeRedFactory.getRectangle(5);
		shape5.draw();
		
		Shape shape6 = shapeRedFactory.getSquare(6);
		shape6.draw();
				
	}
	
}
