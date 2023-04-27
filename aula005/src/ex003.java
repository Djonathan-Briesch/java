import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        System.out.println("Informe 3 valores e siba qual é o maior e o menor");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Segundo número: "); 
        int n2 = entrada.nextInt();

        System.out.print("Terceiro número: ");
        int n3 = entrada.nextInt();

        if(n1 == n2 || n1 == n3 || n2 == n3){
            System.out.print("Os numeros não podem ser iguais");
        } else {
            if (n1 > n2 && n1 > n3) {
                System.out.print("O Primeiro numero " + '(' + n1 + ')' + " é maior");
            } else if(n2 > n1 && n2 > n3) {
                System.out.print("O Segundo numero " + '(' + n2 + ')' + " é maior");
            } else {
                System.out.print("O Terceiro numero " + '(' + n3 + ')' + " é maior");
            }
        }
        entrada.close();
    }
}
