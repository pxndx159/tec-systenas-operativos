package Hilo;

import Main.Buffer;
import java.util.Random;

public class Consumidor extends Thread {
	private Buffer buffer;
	int num = 1;
	
	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		
		
		while(num != -1) {
			
			num = buffer.getValor();

			
			if(num == -1) {
				System.out.println(" FIN");
			}
			else {
				
			
			int x = 1;
			
			for(int y = 1; y <= num; y++) {
				
				x = x * y;
				
			}

			System.out.println(" El factorial del numero " + num + " es " + x);

			
			try {
				sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	
			
		}
	}

}