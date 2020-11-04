package homewo;
import java.util.GregorianCalendar;
public class Gregorian {

	public static void main(String[] args) {
		GregorianCalendar date=new GregorianCalendar();
        System.out.println(date.get(GregorianCalendar.YEAR)+" YEAR "+date.get(GregorianCalendar.MONTH)+" MONTH "+date.get(GregorianCalendar.DAY_OF_MONTH)+" DAY ");
	    date.setTimeInMillis(1234567898765L);
	    System.out.println(date.get(GregorianCalendar.YEAR)+" YEAR "+date.get(GregorianCalendar.MONTH)+" MONTH "+date.get(GregorianCalendar.DAY_OF_MONTH)+" DAY ");
	}

}
