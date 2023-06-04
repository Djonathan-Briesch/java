import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        int anacleto = 150;
        int felisberto = 110;
        int i = 1; //Contador
        Scanner entrada = new Scanner(System.in);

        while (felisberto <= anacleto) {
            anacleto += 2;
            felisberto += 3;

            System.out.println("Ano: " + i);
            System.out.println("Altura de felisberto: " + felisberto);
            System.out.println("Altura de Anaclecio: " + anacleto);
            i++;
            
        }



        entrada.close();
    }
}
