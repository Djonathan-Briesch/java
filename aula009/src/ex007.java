import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        int num;
        double raiz;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para ver se ele tem a raiz quadrada: ");
        num = entrada.nextInt();
        raiz = Math.sqrt(num);
        if(raiz == (int) raiz){
            System.out.println(raiz);
        } else {
            System.out.println("Nao é uma raiz exata");
        }
        entrada.close();
    }
}
