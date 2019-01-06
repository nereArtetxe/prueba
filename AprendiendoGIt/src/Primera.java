import java.util.Scanner;

public class Primera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio=(int)(Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		do {
			
			intentos++;
			System.out.println("Introduce un número, por favor");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("Mas bajo");
			}
			else if (aleatorio > numero) {
				System.out.println("Mas alto");
			}
		}while (numero!=aleatorio);
		
		
		System.out.println("Correcto! El numero es el "+ aleatorio);
		System.out.println("Lo has conseguido en "+intentos+" intentos");
	}

}
