import java.util.Random;
import java.util.Scanner;

public class Field {
	//list of field elements so we can randomize it
	char[] symbollist = {' ','#','*'};
	
	int width = 0;
	int height = 0;

	private char[][] field;
	
	public void getFieldsize() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the width of the field");
		this.width = sc.nextInt();
		System.out.println("Please enter the height of the field");
		this.height = sc.nextInt();
		sc.close();
	}
	
	
	
	
	public int getRandomIndex() {
		Random rand = new Random();
		return rand.nextInt(3)+0;
	}
	
	
	
	public char[][] generateField() {
		this.field = new char[this.height][this.width];
		
		for(int i =0; i < this.height; i++){
			for(int j=0; j < this.width; j++) {
				field[i][j] = '#';	
			}		
		}
		for(int i =1; i< (this.height-1); i++) {
			for(int j=1; j<(this.width-1); j++) {
				// making sure that hamster always starts at an empty field to not cause problems
				if((i == this.height-2) & (j ==((int) this.width*0.5 -1)))  {
					field[i][j] = ' ';
				}else {
					field[i][j] = symbollist[getRandomIndex()];
				}	
			}
		}
		return this.field; 
	}
	
	
	public void addHamstertoField(Hamster hamster) {
		this.field[hamster.movement.getY_coordinate()][hamster.movement.getX_coordinate()] = hamster.symbol;
	}
	
	
	public void printfield() {
		for (int i =0; i< field.length; i++) {
			for(int j = 0; j< field[0].length; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println("");
		}
	}
}
