package Bean;

import Main.Buffer;

public class Memoria implements Buffer {
	private int n;

	public synchronized void setValor(int n) {
		this.n= n;
		notify();
	}

	public synchronized int getValor() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

}