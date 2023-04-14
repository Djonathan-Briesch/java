import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero abaixo de 1000");
        int num = entrada.nextInt();
        int centena = (num/100) * 100;
        int dezena = num % 100;
        int unidade = dezena % 10;
        int dezenaResultado = dezena - unidade;
        System.out.println("A centena é: " + centena);
        System.out.println("A dezena é: " + dezenaResultado);
        System.out.println("A unidade é: " + unidade); 

        entrada.close();
    }
}
