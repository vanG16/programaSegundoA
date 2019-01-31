package programaSegundoA;
import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
       float c;
       	Scanner l=new Scanner(System.in);
       	
       System.out.println("¿Qué calificación obtuviste... compa?");
       	c=l.nextFloat();
       	
       if (c>=80){
    	   System.out.println("Aprobado");
       }
       else{
    	   System.out.println("Reprobado");
       }
	}

}
