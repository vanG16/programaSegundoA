package programaSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
DecimalFormat forma = new DecimalFormat("###,###.##");
double c=0, total=0;

System.out.println("Elije tus productos");
System.out.print("Producto");
double producto = leer.nextDouble();

total= total++;
do{
	
	
	producto= c++;
		
		System.out.println(producto);
	}
while(total>=1500);
	
	total= c;
	
	if(total>=1500){
		total=total*1.11;
	}
	else{
		total=total*1.10;
	}
	System.out.println("Total:$"+forma.format(total));
	
	}

}