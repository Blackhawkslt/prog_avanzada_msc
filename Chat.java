import java.util.Scanner;

public class Chat extends Music {
	public void ChatUsuario() {
        	Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Pregunta 1: Como te llamas ");
        	String respuesta1 = scanner.nextLine();
		System.out.println("Respuesta 1: " + respuesta1);	
        
        	System.out.print("Pregunta 2: Que edad tienes ");
        	String respuesta2 = scanner.nextLine();
		System.out.println("Respuesta 2: " + respuesta2);
       
        	System.out.print("Pregunta 3: De donde eres ");
        	String respuesta3 = scanner.nextLine();
		System.out.println("Respuesta 3: " + respuesta3);
        
        	System.out.print("Pregunta 4: Te gusta la cancion que esta sonando ");
        	String respuesta4 = scanner.nextLine();
		System.out.println("Respuesta 4: " + respuesta4);      
        
		scanner.close();
	}
}