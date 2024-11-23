
public class HamsterMovement {
	private int x_coordinate = 0;
	private int y_coordinate = 0;
	
	
	
	
	public void setCoordinates(int fieldheight, int fieldwidth) {
		// FIXME: This x_coordinate gets set to 0 instead of an actual value
		this.x_coordinate = (int) (0.5 * fieldwidth);
		this.y_coordinate = (fieldheight-2);
	}

	
	
	
	
	public int getX_coordinate() {
		return x_coordinate;
	}

	
	
	
	
	public void setX_coordinate(int x_coordinate) {
		this.x_coordinate = x_coordinate;
	}

	
	
	
	
	public int getY_coordinate() {
		return y_coordinate;
	}

	
	
	
	
	public void setY_coordinate(int y_coordinate) {
		this.y_coordinate = y_coordinate;
	}
	






}
