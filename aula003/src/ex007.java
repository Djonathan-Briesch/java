import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Total de segundos transcorridos: ");
        int totalSeg = entrada.nextInt();
        int horas = totalSeg / 3600;
        int restoHoras = totalSeg % 3600;
        int minutos = restoHoras / 60;
        int segundos = restoHoras % 60;
        System.out.println(horas + "h " + minutos + "min " + segundos + "seg");

        entrada.close();
    }
}
