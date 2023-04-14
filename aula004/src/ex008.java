import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");
        int num = entrada.nextInt();
        if (num < 0) {
            System.out.print("O numero e negativo");
        } else if(num > 0) {
            System.out.print("O numero e positivo");
        } else {
            System.out.print("O numero e zero");
        }
        entrada.close();
    }
}
