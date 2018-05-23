
package main1;

public class Hilo extends Thread {

  
    public static class impar extends Thread {

		private int n;
		public static final int OPERACION_IMPAR =1;
		private int operacion1;
		
		public impar (int n, int operacion1) {
			this.n=n;
			this.operacion1 = operacion1;
		}
		
		public void run() {
			switch (operacion1) {
			case OPERACION_IMPAR:
				
				if(impar(n)) {
					
				System.out.println(" es par ");	
				
				}
				else {
					
					System.out.println(" es impar ");
				}
				break;

			default:
				break;
			}
			
			}
		private boolean impar(int n) {
			return (n%2==0);
		 }
	 }

public  static class Suma extends Thread {
	private int n;
	public static final int OPERACION_SUMA =1;
	private int operacion1;
	int iNumero = 5;
	int iSumatorio = 0;
	int iContador = iNumero;
	
	public Suma (int n, int operacion1) {
		this.n=n;
		this.operacion1 = operacion1;
	}
	
	public void run() {
		switch (operacion1) {
		case OPERACION_SUMA:
			
			while (n != 0) {
				 
				  iSumatorio = iSumatorio + n;
				  n--;
				}
			System.out.println("la sumatoria de"+n+" numero es "+ iSumatorio);
			break;

		default:
			break;
		}
		
		}
	private int Suma(int iSumatorio) {
		return (iSumatorio);
	}
	}

public static class Factorial extends Thread {
	private int n;
	public static final int OPERACION_FACTORIAL =1;
	private int operacion1;
	private int total;
	public Factorial (int n, int operacion1) {
		this.n=n;
		
		
		this.operacion1 = operacion1;
	}
	
	public void run() {
		switch (operacion1) {
		case OPERACION_FACTORIAL:
			
			int total = 1; 
			for (int i=1; i<=n; i++) {
				total = total * i; 
				
				
			}
                        System.out.println("el factorial del numero es "+total);
                        
			break;

		default:
			break;
		}
		
		}
	private int Factorial(int total) {
		return (total);
	}

}

public  static class Primo extends Thread {

		private int n;
		public static final int OPERACION_PRIMO =1;
		private int operacion1;
		
		public Primo (int n, int operacion1) {
			this.n=n;
			this.operacion1 = operacion1;
		}
		
		public void run() {
			switch (operacion1) {
			case OPERACION_PRIMO:
				 boolean bandera=true;
				for (int y = 2; y < n; y++) {
	                if (n % y == 0) {
	                    bandera=false;
	                    if (bandera)
	                    {
	                    	System.out.println("es un numero primo "+ n);
	                    }
	                    else {
	                    	System.out.println("no es un numero primo "+ n);
	                    	}
	                    }
	                    	
	                    }
				break;

			default:
				break;
			}
			
			}
		private  int Primo(int n) {
			return n;
		}
		}
	
public static class Fibonnaci extends Thread {

		private int n;
		public static final int OPERACION_FIBONNACI =1;
		private int operacion1;
		
		public Fibonnaci(int n, int operacion1) {
			this.n=n;
			this.operacion1 = operacion1;
		
		}
		
		public void run() {
			switch (operacion1) {
			case OPERACION_FIBONNACI:
				
				   int fibo1,fibo2,i;
			        do{
			            System.out.print("Introduce numero mayor que 1: ");
			        }while(n<=1);
			        System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:"); 

			        fibo1=1;
			        fibo2=1; 

			        System.out.print(fibo1 + " ");
			        for(i=2;i<=n;i++){
			             System.out.print(fibo2 + " ");
			             fibo2 = fibo1 + fibo2;
			             fibo1 = fibo2 - fibo1;
			        }
			        System.out.println(" fibonnaci de"+n+" es "+fibo1+" y "+fibo2);
			        
			       
				break;

			default:
				break;    
			}
				
		} 
		private int Fibonnaci(int fibo1) {
			return fibo1 ;
			
		}
		}

}
