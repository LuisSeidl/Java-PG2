
public class Field {
	private char[][] field;
	
	public char[][] generateField(int height, int width) {
		this.field = new char[height][width];
		
		for(int i =0; i < height; i++){
			for(int j=0; j < width; j++) {
				field[i][j] = '#';	
			}
		}
		return this.field; 
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
