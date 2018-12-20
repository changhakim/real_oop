package gms21;

import java.util.Random;

public class StudentService {

	public String hakbun() {
		String hakbun = "";
		int a = 0;
		Random random = new Random();
		for(int i = 0;i< 9;i++) {
			a = random.nextInt(10);
			hakbun += a;
		}
		
		return hakbun;
		
	}
}
