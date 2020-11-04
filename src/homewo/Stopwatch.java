package homewo;
import java.util.Date;
import java.util.Random;
public class Stopwatch {
    private  long startTime,endTime;
    
    public Stopwatch(){
    	Date date = new Date();
    	startTime=date.getTime();     
    	 }
    public void start() {
    	Date date = new Date();
    	startTime=date.getTime();     
    }
    public void stop() {
    	Date date = new Date();
    	endTime=date.getTime();
    }

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
    long getElapsedTime() {
    	return endTime-startTime;
    }
}

