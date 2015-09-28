import java.util.Random;
/*========================================
 * Creates Processes to be stored into memory
 * 
 * 
 * Group 4:
 * Nicholas Bettencourt,Albert Chen,
 * Casey Thacy, Christy Blank,
 * Brandon Blank, Sandy Blank,
 * Neha Blank
 * 
 * To do: Replace "blank" with names
 *========================================
 */
public class Process {
    private int size;
    private int duration;
    private int name;
    private final int[] SIZES={5,11,17,31};
    private final int[] DURATIONS={1,2,3,4,5};
    Random r= new Random();
    Process(int i,int q)
    {
    	size=randomSize();
    	duration=randomDuration();
    	name=(i*1000)+(q);
    }
    int randomSize(){
    	int num=r.nextInt(4);
    	return SIZES[num];
    }
    int randomDuration(){
    	int num=r.nextInt(5);
    	return DURATIONS[num];
    }
    public int getName(){
    	return name;
    }
    public int getSize(){
    	return size;
    }
    public int getDuration(){
    	return duration;
    }

}
