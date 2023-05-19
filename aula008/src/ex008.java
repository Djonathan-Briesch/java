import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro para realizar a operação: ");
        System.out.println("1/1 + 1/n");
        int num = entrada.nextInt();
        
        if (num > 0) {
            double resultado = 1.0;        
            for (int i = 2; i <= num; i++) {
                resultado += 1.0 / i;
            }  
            
            System.out.println("O resultado é " + resultado); 
        } else {
            System.out.println("O número não é maior que 0");
        }
        
        entrada.close();
    }
}
