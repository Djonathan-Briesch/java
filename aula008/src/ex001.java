import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Descobrir a tabuada!!!");
        System.out.println("Digite um numero de 1 a 10: ");
        int numTabuada = entradaUsuario.nextInt();
        if (numTabuada == 0) {
            System.out.println("Toda multiplicacao por zero vai dar 0");
        } else if (numTabuada > 10) {
            System.out.println("Nao desenvolvemos alem disso");
        } else {
            for (int i = 1; i <= 10; i++) {
                int resultado = numTabuada * i;
                System.out.println(numTabuada + " x " + i + " = " +     resultado);
            }
            entradaUsuario.close();
        }
    }
}
