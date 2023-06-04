import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular a media!!!");
        boolean executando = true;
        while (executando == true) {
            System.out.print("Escreva o numero 1: ");
            double num1 = entrada.nextInt();
            System.out.print("Escreva o numero 2: ");
            double num2 = entrada.nextInt();
            System.out.print("Escreva o numero 3: ");
            double num3 = entrada.nextInt();
            System.out.print("Escreva o numero 4: ");
            double num4 = entrada.nextInt();
            double resultado = num1 + num2 + num3 + num4/4;
            System.out.println("A media dos numeros é: " + resultado);
            System.out.println("---------------------------------------");
            System.out.println("Deseja fazer outra media?");
            System.out.println("1 - Sim\n2 - Não");
            int resposta = entrada.nextInt();
           if (resposta == 2) {
            executando = false;
           }
        }
        entrada.close();
    }
}
