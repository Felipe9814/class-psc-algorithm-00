/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
		String sala_des = "A219";
		String sala_inf = "" ;
		 Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero da sala: ");
		 sala_inf = scanner.next();
		 
		 if (sala_des.equals(sala_inf)) {
		 System.out.println("ACHOU A SALA!");
		     
		 } else {
	
		 System.out.println("SE PERDEU!"); }
		 
		 scanner.close();
	}
}