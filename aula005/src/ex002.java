import java.util.Scanner;

public class ex002 {
    public static void main (String[] args){
        System.out.println("Posso votar ou dirigir?");
        System.out.println("Informe sua idade e descubra: ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        if (idade > 0 && idade < 120) {
            if (idade < 16) {
                System.out.print("Você não pode votar nem pode dirigir");
            } else if(idade < 18) {
                System.out.print("O voto é facultativo mas você não pode dirigir");
            } else {
                System.out.print("Voto obrigatorio e você pode dirigir");
            }
        } else {
            System.out.print("Idade invalida");
        }


         


        entrada.close();
    }
}
