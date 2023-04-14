import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Base: ");
        double base = entrada.nextDouble();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        double area = (base * altura)/2;
        System.out.println("Área: " + area);
        entrada.close();
    }
}
