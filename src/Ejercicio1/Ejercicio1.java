package Ejercicio1;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float centi = Validacion();
		float fahren = Centiafahren(centi);
		
		System.out.println(centi + " centígrados vale " + fahren + " en fahrenheit");
	}
	
	public static float Validacion(){
		Scanner sc = new Scanner(System.in);
		String grado;
		float grados = 0f;
		boolean error = true;
		
		do{
			error = false;
			System.out.print("Introduce los grados centígrados: ");
			grado = sc.next();
			if(tryparse(grado)){
				grados = Float.parseFloat(grado);
			}else{
				error = true;
				System.out.println("ERROR: No has introducido un número");
			}
			
		}while(error);
		
		return grados;
	}
	
	public static boolean tryparse(String grado){
		try{
			Float.parseFloat(grado);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}
	
	public static float Centiafahren(float centigrados){
		return 32 + (9 * (centigrados/5));
	}

}
