import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual time esta ganhando?");
        System.out.print("Gols do primeiro time: ");
        int golTime1 = entrada.nextInt();
        System.out.print("Gols do segundo time: ");
        int golTime2 = entrada.nextInt();

        if(golTime1 > golTime2){
            System.out.print("O primeiro time está ganhando!!!");
        } else if(golTime2 > golTime1){
            System.out.print("O segundo time esta gamhando!!!");
        } else {
            System.out.print("Empate");
        }

        entrada.close();
    }
}
