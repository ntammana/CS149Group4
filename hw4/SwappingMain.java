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
	//public static Process[][] p= new Process[5][100];   //creates five hundred processes, running one hundred at a time
	
	public static Process[] p1= new Process[100];
	public static Process[] p2= new Process[100];
	public static Process[] p3= new Process[100];
	public static Process[] p4= new Process[100];
	public static Process[] p5= new Process[100];
	public static void main(String[]args){
		for(int i=0;i<100;i++){p1[i]=new Process(i);}
		for(int i=0;i<100;i++){p2[i]=new Process(i);}
		for(int i=0;i<100;i++){p3[i]=new Process(i);}
		for(int i=0;i<100;i++){p4[i]=new Process(i);}
		for(int i=0;i<100;i++){p5[i]=new Process(i);}
		
		ff();
		bf();
		nf();

	}
	public static void ff(){
		firstFit ff1= new firstFit(p1,MAINMEM,TIME,false);
		firstFit ff2= new firstFit(p2,MAINMEM,TIME,false);
		firstFit ff3= new firstFit(p3,MAINMEM,TIME,false);
		firstFit ff4= new firstFit(p4,MAINMEM,TIME,false);
		firstFit ff5= new firstFit(p5,MAINMEM,TIME,false);
		
		ff1.run();
		ff2.run();
		ff3.run();
		ff4.run();
		ff5.run();
		
		}
		
	

	public static void bf(){
		bestFit bf1 = new bestFit(p1,MAINMEM,TIME,false);
		bestFit bf2 = new bestFit(p2,MAINMEM,TIME,false);
		bestFit bf3 = new bestFit(p3,MAINMEM,TIME,false);
		bestFit bf4 = new bestFit(p4,MAINMEM,TIME,false);
		bestFit bf5 = new bestFit(p5,MAINMEM,TIME,false);
		
		bf1.run();
		bf2.run();
		bf3.run();
		bf4.run();
		bf5.run();
	}
	public static void nf(){
		nextFit nf1= new nextFit(p1,MAINMEM,TIME,false);
		nextFit nf2= new nextFit(p2,MAINMEM,TIME,false);
		nextFit nf3= new nextFit(p3,MAINMEM,TIME,false);
		nextFit nf4= new nextFit(p4,MAINMEM,TIME,false);
		nextFit nf5= new nextFit(p5,MAINMEM,TIME,false);
		
		nf1.run();
		nf2.run();
		nf3.run();
		nf4.run();
		nf5.run();
		
	}
}
