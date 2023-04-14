import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = entrada.nextInt();
        int resultado = num % 5;
        if (resultado == 0) {
            System.out.print("O número digitado é multiplo de 5");
        } else {
            System.out.print("O número não é multiplo de 5");
        }
        entrada.close();
    }
}