package hilo;

import java.util.Random;

import Main.Buffer;
import java.util.Scanner;

public class Productor extends Thread {
	private Buffer buffer;
	int n;
	public Productor(Buffer buffer) {
		// TODO Auto-generated constructor stub
		this.buffer = buffer;
	}
	@Override
	public void run() {
		
		Scanner teclado = new Scanner(System.in);

		
		while(n != -1) {
			System.out.println(" ingrese numero");
			n = teclado.nextInt();
			buffer.setValor(n);
			
			if(n== -1) {
				System.out.println(" FIN");
			}
			else {
				
			
				try {
					Thread.sleep(8);				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}