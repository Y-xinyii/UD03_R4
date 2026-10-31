import java.util.Scanner;

public class NotasCentinela{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        double nota;
        int valida = 0;
        int descartada = 0;        

        do{
            System.out.print("Introducir una nota(-1 para terminar): ");
            nota = scanner.nextDouble();

            if(nota == -1){
                break;

            }else{
                if(nota >= 0 && nota <= 10){
                valida ++;

                }else{
                descartada ++;                
                }
            }           
        }while(nota != -1);

        System.out.println("Notas válidas: " + valida);
        System.out.println("Notas descartadas: " + descartada);

        scanner.close();
    }
    
}