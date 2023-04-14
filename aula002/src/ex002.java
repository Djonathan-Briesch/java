import java.util.Scanner;

public class ex002 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("X: ");
        double x = entrada.nextDouble();
        System.out.print("Y: ");
        double y = entrada.nextDouble();
        double quoc = x / y;
        double resto = x % y;
        System.out.println("Quociente: " + quoc);
        System.out.println("Resto: " + resto);
        entrada.close();
    }
}
