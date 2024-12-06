
public class Corn extends Field{
	private char symbol = '*';

	// Class is not needed, the only use of it would be to instead of using the char for the elements (' ','#','*') to instead
	// get them using corn.getSymbol()... but then we would need to initialize an Object in the Main just so we can use it once.
	// thats why i decided to not use them and in a real-life code i would probably delete them. 
	
	
	public char getSymbol() {
		return symbol;
	}

	
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
}
