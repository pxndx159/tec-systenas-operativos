package inter;

import Bean.Memoria;
import Hilo.Consumidor;
import hilo.Productor;
import Main.Buffer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer b = new Memoria();
		
		Productor p = new Productor(b);
		Consumidor c = new Consumidor(b);
		
		p.start();
		c.start();

		
	}

}