import java.util.Scanner;

public class ex001 { // Estruturas de repetição
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        double resultado = (nota1 + nota2)/2;
        System.out.println(resultado);

        if (resultado <= 3) {
            System.out.print("Reprovado");
        } else if(resultado < 7){
            System.out.print("Em exame");
        } else {
            System.out.print("Aprovado!!");
        }


        entrada.close();
    }
}
