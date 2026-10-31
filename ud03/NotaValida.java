import java.util.Scanner;

public class NotaValida{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double nota;

        do{
            System.out.println("Introducir la nota(0-10): ");
        nota = scanner.nextDouble();

        if(nota >= 0 && nota <= 10){
            System.out.println("Nota registrada: " + nota);

        }else{
            System.out.println("Nota no válida, inténtalo de nuevo.");
        }
        
        }while(nota < 0 || nota > 10);
        scanner.close();   
    }
}