
public class Hamster{
	char symbol = '^';
	int cornlevel = 0;
	HamsterMovement movement = new HamsterMovement();

	
	public void turnRight() {
		switch(symbol) {
		case '^':
			this.symbol = '>';
			break;
		case '>':
			this.symbol = 'v';
			break;
		case 'v':
			this.symbol = '<';
			break;
		case '<':
			this.symbol = '^';
			break;
		}
	}
	public void turnLeft() {
		switch(symbol) {
		case '^':
			this.symbol = '<';
			break;
		case '<':
			this.symbol = 'v';
			break;
		case 'v':
			this.symbol = '>';
			break;
		case '>':
			this.symbol = '^';
			break;
		}
	}
	
	public void moveForward(char[][] checkfield) {
		switch(symbol) {
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
	
	
	
}
