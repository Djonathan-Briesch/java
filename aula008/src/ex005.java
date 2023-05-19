import java.util.Arrays;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 10 numeros inteiros");
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            if (numeros[i] < 0) {
                System.out.println("ERRO!!!");
                System.exit(0);
            }
        }
        Arrays.sort(numeros);
        System.out.println("O maior número e: " + numeros[numeros.length - 1]);
        System.out.println("O menor numero e: " + numeros[0]);

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        double media = (double) soma / numeros.length;
        
        System.out.println("A media dos numeros e: " + media);
        entrada.close();
    }
}
