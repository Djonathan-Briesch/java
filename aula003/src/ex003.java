import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int anoNasc = entrada.nextInt();
        int idade = 2023 - anoNasc;
        System.out.print("A sua idade em 2023 é " + idade);

        entrada.close();
    }
}
