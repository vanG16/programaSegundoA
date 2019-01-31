package programaSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner (System.in);
DecimalFormat forma = new DecimalFormat("###,###.##");
 double producto=0, total=0;


	System.out.println("Elije tus productos");
	System.out.print("Producto");
	double producto1 = leer.nextDouble();
	
	total= producto1;
	 
	do{
	
	 producto1= producto++;
	
	System.out.println(producto1);
	
	}while(producto<=100);
	
	if(total>=1500){
		total=total*1.11;
	}
	else{
		total=total*1.10;
	}
	System.out.println("Total:$"+forma.format(total));
	
	

}

}
