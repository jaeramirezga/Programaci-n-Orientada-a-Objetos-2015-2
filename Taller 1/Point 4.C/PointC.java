import java.util.Scanner;
// Se importa la libreria Scanner, para poder entrar valores
public class PointC {

	public static void main(String[] args) {
		//Se crea el main 
		int suma = 0, numeros = 0;
		//Se crean dos variables de tipo entero, las cuales usaremos para guardar datos
		Scanner leer = new Scanner(System.in);
		//Se crea un objeto de tipo Scanner, para poder leer los numeros que se ingresaran
		int numero;
		//Se crea una variable de tipo entero
		System.out.println("Dijite un numero entero: ");
		do{
			System.out.print((numeros+1)+": ");
			//Se imprime el numero que se ingresara
			numero = leer.nextInt();
			//Se le dan los valores de el numero digitado a la variable numero
			if (numero == 9999)
				//Se comprueba que el digito ingresado no es 9999 para seguir ejecutando, de lo contrario, se saldra
				break;
			numeros++;
			//Se le suma 1 a la variable numeros
			suma += numero;
			//Se le van sumando el valores ingresados antes de que se ingrese el numero 9999
		  }while( numero != 9999);
		//Se comprueba que no sea ingresado el numero 9999 para seguir en el ciclo, de lo contrario se saldra
		System.out.print("The average is: "+suma/numeros);
		}			
	}



