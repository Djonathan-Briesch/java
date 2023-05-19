import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 10 numeros para saber quais são pares e impares");
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
            if (numeros[i] < 0 || numeros[i] > 10) {
                System.out.println("ERRO!!!");
                System.exit(0);
            } else {
                numeros[i] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " e par");
            } else {
                System.out.println(numeros[i] + " e impar");
            }
        }
       
        System.out.println(numeros);
        

        entrada.close();
    }

}
