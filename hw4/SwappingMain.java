/*========================================
 * Demonstrates swapping for memory management
 * 
 * 
 * Group 4:
 * Nicholas Bettencourt,Albert Chen,
 * Casey Thacy, Christy Blank,
 * Brandon Blank, Sandy Blank,
 * Neha Blank
 * 
 * To do: Replace "blank" with names
 *========================================*/
public class SwappingMain {
	private static final int MAINMEM = 100;
	private static final int TIME = 60;//runs for 60 seconds
	
	public static void main(String[]args){
		Process[][] p= new Process[5][100];   //creates five hundred processes, running one hundred at a time
		for(int i=0;i<5;i++){                 
			for(int q=0;q<100;q++){
				p[i][q]= new Process(i,q);
			}			
		}
	}
}
