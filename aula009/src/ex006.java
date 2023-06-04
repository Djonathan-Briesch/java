import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        double num;
        int i = 0;
        int soma =0;
        double resultado = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um numero para saber se ele é execivo ou nao: ");
        num = entrada.nextDouble();
        while (i < num) {
            resultado = num % i;
            if (resultado == 0) {
                soma += i;
            }
            i++;
        }
        if (soma < num) {
            System.out.println("Nao e um numero execivo!!!");
        } else{
            System.out.println("E um numero execivo!!!");
        }

        entrada.close();
    }

}
