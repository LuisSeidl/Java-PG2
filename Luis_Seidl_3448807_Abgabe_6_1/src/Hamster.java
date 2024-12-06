import java.util.Scanner;

public class Hamster{
	char direction = '^';
	int cornlevel = 0;
	HamsterMovement movement = new HamsterMovement();

	
	public void turnRight() {
		switch(direction) {
		case '^':
			this.direction = '>';
			break;
		case '>':
			this.direction = 'v';
			break;
		case 'v':
			this.direction = '<';
			break;
		case '<':
			this.direction = '^';
			break;
		}
	}
	
	
	public void turnLeft() {
		switch(direction) {
		case '^':
			this.direction = '<';
			break;
		case '<':
			this.direction = 'v';
			break;
		case 'v':
			this.direction = '>';
			break;
		case '>':
			this.direction = '^';
			break;
		}
	}
	
	
	public void moveForward(char[][] checkfield) {
		switch(direction) {
		case '^':
			if(checkfield[this.movement.getY_coordinate()-1][this.movement.getX_coordinate()] == '#') {
				System.out.println("Hamster can't move in that direction because a wall is there");
				break;
			} else {
				if(checkfield[this.movement.getY_coordinate()-1][this.movement.getX_coordinate()] == '*') {
					this.cornlevel += 1;
				}
				this.movement.setY_coordinate(this.movement.getY_coordinate()-1);
				break;
			}
		case '<':
			if(checkfield[this.movement.getY_coordinate()][this.movement.getX_coordinate()-1] == '#') {
				System.out.println("Hamster can't move in that direction because a wall is there");
				break;
			} else {
				if(checkfield[this.movement.getY_coordinate()][this.movement.getX_coordinate()-1] == '*') {
					this.cornlevel += 1;
				}
				this.movement.setX_coordinate(this.movement.getX_coordinate()-1);
				break;
			}
		case 'v':
			if(checkfield[this.movement.getY_coordinate()+1][this.movement.getX_coordinate()] == '#') {
				System.out.println("Hamster can't move in that direction because a wall is there");
				break;
			} else {
				if(checkfield[this.movement.getY_coordinate()+1][this.movement.getX_coordinate()] == '*') {
					this.cornlevel += 1;
				}
			this.movement.setY_coordinate(this.movement.getY_coordinate()+1);
			break;
			}
		case '>':
			if(checkfield[this.movement.getY_coordinate()][this.movement.getX_coordinate()+1] == '#') {
				System.out.println("Hamster can't move in that direction because a wall is there");
				break;
			} else {
				if(checkfield[this.movement.getY_coordinate()][this.movement.getX_coordinate()+1] == '*') {
					this.cornlevel += 1;
				}
			this.movement.setX_coordinate(this.movement.getX_coordinate()+1);
			break;
			}
		}
	}
	
	
	public Boolean getFunction(Field field,char[][] checkfield, Boolean game) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the following Functions for the Hamster: \n1. Turn Left \n2. Turn Right \n3. Move Forward \n4. Output the amount of Corn the Hamster has eaten\n5. Stop the Game");
		int decision = sc.nextInt();
		/* here you should close the scanner but if i do that it not only closes this scanner but closes my whole System.in input stream as well, so if i close it now, the next time i want to 
		 * get the movement for the hamster it will throw me a "java.util.NoSuchElementException' error. This is why in the switch case 5, when we decide to stop playing the Game i close the Scanner,
		 * because there is no input needed afterwards. this also closes the Scanner in the Field class, because it closes the whole input Stream (according to Stackoverflow)  */
		
		switch(decision) {
		case 1: this.turnLeft();
			field.addHamstertoField(this);
			return game;
			
		case 2: this.turnRight();
			field.addHamstertoField(this);
			return game;

		case 3: field.deleteHamsterFromField(this);
			this.moveForward(checkfield);
			field.addHamstertoField(this);
			return game;

		case 4: System.out.println("The Hamster has eaten "+ cornlevel + " corn, he's a chunky boi");
			break;
		case 5: game = false;
			System.out.println("\n \n Thanks for Playing! \n");
			sc.close(); // closing the scanner here 
			return game;
		default:
			System.out.println("Please enter a valid input");
			return game;
		
		}
		return game; //can't really do anything to fix this message, because if i would close it here the game wouldn't work
	}
	
	
}
