import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) throws Exception {
        System.out.println("Você pode doar sangue?");
        System.out.println("Informe sua idade para saber: ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        if (idade >= 18 && idade <= 67) {
            System.out.print("Você pode doar sangue!!!");
        } else {
            System.out.print("Você não pode doar sangue");
        }

        entrada.close();
    }
}
