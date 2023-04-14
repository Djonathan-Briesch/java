import java.util.Scanner;

public class ex002 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Distância percorrida (Km): ");
        double distancia = entrada.nextDouble();
        System.out.print("Quantidade de combustível (l): ");
        double quantComb = entrada.nextDouble();
        double consumoMedio = distancia/quantComb;
        System.out.print("Consumo médio: " + consumoMedio + "km/l");

        entrada.close();
    }
}
