import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        int num;
        int num2;
        int i = 0;
        int i2 = 0;
        int soma =0;
        double resultado = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva dois numeros para saber se eles sao amigaveis ou nao: ");
        System.out.print("Numero 1: ");
        num = entrada.nextInt();
        System.out.print("Numero 2: ");
        num2 = entrada.nextInt();
        while (i < num) {
            resultado = num % i;
            if (resultado == 0) {
                soma += i;
            }
            i++;
        }
        while (i2 < num2) {
            resultado = num % i2;
            if (resultado == 0) {
                soma += i2;
            }
            i2++;
        }
        if (soma < num) {
            System.out.println("Nao e um numero execivo!!!");
        } else{
            System.out.println("E um numero execivo!!!");
        }

        entrada.close();
    }
    }


