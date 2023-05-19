import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para saber o fatorial dele");
        int num = entrada.nextInt();
        if (num > 0) {
            int resultadoFatorial= num;
            for (int i = 2; i <= num; i++) {
                resultadoFatorial *= i;
            }  
            System.out.println("O fatorial de " + num + "e " + resultadoFatorial);   
        } else {
            System.out.println("Nao existe fatorial menor que 0");
        }
        entrada.close();
    }
}
