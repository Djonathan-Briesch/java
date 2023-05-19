import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro para saber se ele é primo ou não");
        int num = entrada.nextInt();

        if (num > 1) {
            boolean ePrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ePrimo = false;
                    break;
                }
            }

            if (ePrimo) {
                System.out.println("O número é primo");
            } else {
                System.out.println("O número não é primo");
            }
        } else {
            System.out.println("Somente números inteiros maiores que 1 podem ser primos.");
        }

        entrada.close();
    }
}
