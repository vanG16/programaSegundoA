package programaSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat forma = new DecimalFormat("###,###.##");
		Scanner leer = new Scanner(System.in);
		
		byte numero =0, i=0;
		double suma=0;
		
		do{
	System.out.print("ingrese numero");
	numero= leer.nextByte();
	if(numero>=0 && numero<=76){
		suma+=numero;
		//suma=suma+numero
		i++;
		
	}
		
	}while(numero<=76);
		
		System.out.println("La suma es:"+suma+" El promedio es:"+forma.format(suma/i));

	}
}
