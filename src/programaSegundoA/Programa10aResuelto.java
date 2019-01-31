package programaSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10aResuelto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double total=0.0, producto =0.0;
		DecimalFormat forma = new DecimalFormat("###,###.##");
		byte i=0, numero=0;
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Elije tus productos");
		numero= leer.nextByte();
		i++;
		do{
			System.out.print("ingrese el numero de productos");
			producto=leer.nextDouble();
			
			total+=producto;
		}while (i<=numero);
		
		if(total>=1500){
			System.out.println("el monto es:"+total+" el total es:"+(total=total*1.11));
			
		}else {
			
	}

}
