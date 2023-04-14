import java.util.Scanner;

public class ex006 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("1ª nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("2ª nota: ");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2)/2;
        System.out.println("Média final: " + media);
        if (media >= 7){
            System.out.println("APROVADO!");
        }
        else{
            System.out.println("REPROVADO!");
        }
        entrada.close();
    }
}
