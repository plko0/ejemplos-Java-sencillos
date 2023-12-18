package entornos;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		  long f=1;
		  int n;
		  System.out.println("Introduce un numero: ");
		  n=teclado.nextInt();
		  for (int i=1; i<=n; i++) {
			  f=f+i;
		  }
		  System.out.println("El Factorial es: "+f);
		  teclado.close();
	}

}
