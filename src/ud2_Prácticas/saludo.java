package ud2_Prácticas;

import java.util.Scanner;

public class saludo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int hora = scan.nextInt();
		scan.close();

		if((hora<0)||(hora>23)){
			System.out.println("La hora introducida no es válida.");
			System.exit(1);
		}
		
		if ((hora>=6)&&(hora<=14)) {
			System.out.println("Buenos días");
		}
		else
			if ((hora>14)&&(hora<=20)){
				System.out.println("Buenas tardes");
			}
			else{
				System.out.println("Buenas noches");
			}
	}

}
