

public class HamsterGame {

	public static void main(String[] args) {
		Field field = new Field();
		Hamster hamster = new Hamster();
		
		
		// Start-up phase
		field.getFieldsize();
		field.generateField();
		hamster.movement.setCoordinates(field.height,field.width);
		field.addHamstertoField(hamster);
		
		Boolean game_on = true;
		
		// game phase
		while (game_on) {
			field.printField();
			System.out.println("------------------------------------------- ");
			game_on = hamster.getFunction(field,field.getField(),game_on);
			System.out.println("------------------------------------------- \n" );
			
		}
	}
	
	
}
