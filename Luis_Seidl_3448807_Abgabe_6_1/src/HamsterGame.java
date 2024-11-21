

public class HamsterGame {

	public static void main(String[] args) {
		Field field = new Field();
		Hamster hamster = new Hamster();
		
		field.getFieldsize();
		field.generateField();
		hamster.movement.setCoordinates(field.height,field.width);
		field.addHamstertoField(hamster);
		field.printfield();
		
	}

}
