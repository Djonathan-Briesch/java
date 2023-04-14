import java.util.Scanner;

public class ex001 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double x, y, z;
        System.out.print("Digite a primeira nota: ");
        x = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        y = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        z = entrada.nextDouble();
        double media = (x + y + z)/3;
        System.out.println("Média das notas: " + media);
        
        entrada.close();
    }
}
