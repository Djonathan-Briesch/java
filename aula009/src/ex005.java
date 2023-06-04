import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        double base;
        double expoente;
        double resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculo de expoente!!!");
        System.out.print("Digite o valor da base: ");
        base = entrada.nextDouble();
        if (base > 1) {
            System.out.print("Digite o valor do expoente: ");
            expoente = entrada.nextDouble();
            if (expoente > 1) {
                resultado = Math.pow(base, expoente);
                System.out.println("O resultado do expoente é: "+ resultado);
            } else {
                System.out.println("O valor do expoente deve ser maior que 1 !!!");
            }
            
        } else {
            System.out.println("O valor da base deve ser maior ou igual a 2 !!!");
        }
        


        entrada.close();
    }
}
