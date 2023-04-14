import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se ele é par ou ímpar");
        System.out.print("Numero: ");
        int num = entrada.nextInt();
        int resultado = num % 2;
        
        if(resultado == 0){
            System.out.println("O numero digitado é PAR!!!");
        }else {
            System.out.println("O numero digitado é Ímpar!!!");
        }


        entrada.close();
    }
}
