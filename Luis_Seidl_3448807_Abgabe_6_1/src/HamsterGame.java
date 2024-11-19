
public class HamsterGame {

	public static void main(String[] args) {
		Field field = new Field();
		Hamster hamster = new Hamster();
		Wall wall = new Wall();
		Corn corn = new Corn();
		EmptyField empty = new EmptyField();
		
		
		field.generateField(17, 10);
		field.printfield();
		
		
		char matrix[][] = { {'#','#','#','#','#','#','#','#','#','#','#'},
							{'#',' ',' ','*',' ','#','#','#',' ','*','#'},
							{'#',' ','#',' ','*','#','*',' ',' ',' ','#'},
							{'#',' ','#','#',' ','*','*','#','#',' ','#'},
							{'#',' ','*',' ','#',' ','*',' ','#','*','#'},
							{'#','#',' ','*','#','#',' ',' ',' ',' ','#'},
							{'#',' ','*','#',' ',' ','*','#','#',' ','#'},
							{'#','#','#','#','#','#','#','#','#','#','#'}};
			
		

	}

}
