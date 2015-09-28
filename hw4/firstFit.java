
public class firstFit {
	
	private static Process[] m= new Process[100]; //Total memory available for processes
	private static int mem;
	private static int t; //Total time available
	private static boolean x; //Determine if use compacter
	private static int currentTime;
	private static int average;
	public static Process[] p;
	
	
	public firstFit(Process[] processes, int mainmem, int time, boolean b) {
		p= processes;
		mem= mainmem;
		t= time;
		x=b;
		currentTime=0;
	}
	//public static void firstFit(){}
	public void run(){
		for(int i=0;i<p.length;i++){
			int slot=findFirstFit(p[i].getSize());
			if(slot>=0){
				insert(slot,p[i]);
				Printer.memMap(p);
			}
		}
		
	}
	private void insert(int slot, Process process) {
		// TODO Auto-generated method stub
		for(int i=slot;i<process.getSize();i++)
		{
			m[i]=process;
		}
		
	}
	private int findFirstFit(int size) {
		 int start = 0;
	        int end = -1;
	         
	        for(int i = 0; i < mem; i++){
	            if (m[i]== null) {
	                if (start > end){   
	                    start = i;
	                    end = i;
	                }else{end = i;}
	                }else{start = i;}
	            if ((end - start + 1) >= size){
	                return start;
	            }
	        }
	 
	        return -1;
	}
	public int getAverage() {
		// TODO Auto-generated method stub
		return average;
	}
	public static Process getProcess(int i)
	{
		return p[i];
	}

}
