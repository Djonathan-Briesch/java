import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Minutos transcorridos: ");
        int minTransc = entrada.nextInt();
        int horas = minTransc/60;
        int minutos = minTransc%60;
        System.out.println(horas + "h " + minutos + "min");

        entrada.close();
    }
}
