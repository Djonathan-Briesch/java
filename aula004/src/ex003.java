import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificaçao para ver se os numeros são iguais");
        System.out.print("Númeoro 1: ");
        int n1 = entrada.nextInt();
        System.out.print("Númeoro 2: ");
        int n2 = entrada.nextInt();

        if(n1 == n2){
            System.out.print("Os números são iguais");
        } else {
            System.out.print("Os números são diferentes");
        }

        entrada.close();
    }
}
