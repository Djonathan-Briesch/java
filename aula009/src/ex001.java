import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        int i = 0;
        while (i <= num) {
            System.out.println(i + " + " + num + " = " + (i + num));
            i++;    
        }
        entrada.close();
    }
}
