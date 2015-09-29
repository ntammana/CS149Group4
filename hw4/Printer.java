import java.util.Arrays;

public class Printer {
	private static String[] output= new String[100];

	public static void start() {
		// TODO Auto-generated method stub
		Arrays.fill(output, "...");
		System.out.print(" Cs 149 Section 02 \n Group 4 output \n Nicholas Bettencourt, Albert Chen, Casey Thavy, \n Christy Eicher, Sandy Yi, Brandon Trieu, \n Neha Something");
	}
	public static void out(){
		
	}
	public static void memMap(Process[] p) {
		System.out.print("\n [");
		for(int i=0; i<output.length;i++)
		{
			System.out.print(" "+ p[i].getName());
		}
		
	}
	public static void printTest(Process[] p){
		for(int i=0;i<100;i++){
			System.out.println("Name: " + p[i].getName() + " Size: " + p[i].getSize() + " Duration: " + p[i].getDuration());
	}
	}
	public static void printAdd(Process process){
		System.out.println("Added: "+ process.getName() + " of size " + process.getSize()
				+ " and duration "	+ process.getDuration()	);
	}

	public static void printRemove(Process process) {
		System.out.println("Removed: Process " + process.getName() );
	}
}
