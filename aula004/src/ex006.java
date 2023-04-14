import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de x:");
        double x = entrada.nextDouble();
        System.out.println("Digite o valor de y:");
        double y = entrada.nextDouble();
        double z = x;
        x = y;
        y = z;
        

        System.out.print("Agora o valor de y é: " + y + " e o valor de x é: " + x);

        entrada.close();
    }
}
