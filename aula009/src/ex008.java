import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("1º número: ");
        int num1 = entrada.nextInt();
        System.out.print("2º número: ");
        int num2 = entrada.nextInt();
        int soma1 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0)
                soma1 += i;
        }
        int soma2 = 0;
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0)
                soma2 += i;
        }
        if ((soma1 == num2) && (soma2 == num1))
            System.out.println(num1 + " e " + num2 + " são NÚMEROS AMIGÁVEIS");
        else
            System.out.println(num1 + " e " + num2 + " NÃO são NÚMEROS AMIGÁVEIS");
            
            entrada.close();
        }
}
