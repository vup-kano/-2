package homewo;
import java.util.Random;
public class select {

	public static void main(String[] args) {
		Stopwatch date=new Stopwatch();
		Random random =new Random();
		int [] s=new int[100000];
		for(int i=0 ;i<100000;++i) {
			s[i]=random.nextInt(100000);
		}
		date.start();
		for(int i=0;i<100000;++i) {
			for(int j=i;j<100000;++j) {
				int tmp=0;
				if(s[i]>s[j]) {
					tmp=s[i];
				    s[i]=s[j];
				    s[j]=tmp;
				}
			}
		}
		date.stop();
		System.out.println(date.getElapsedTime());

	}

}
