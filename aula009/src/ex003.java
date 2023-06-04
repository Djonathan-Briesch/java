import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        int totalNumeros = 10;
        int contador = 0;
        int maior = 0;
        int menor = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números:");

        while (contador < totalNumeros) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        entrada.close();
    }
}
