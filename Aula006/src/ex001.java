import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double n1 = entrada.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double n2 = entrada.nextDouble();
        System.out.println("Informe agora a operação desejada");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("A soma de " + n1 + " mais " + n2 + " é " + soma(n1, n2));
                break;
            case 2:
            System.out.println("A Subtracao de " + n1 + " menos " + n2 + " é " + subtracao(n1, n2));
                break;
            case 3:
            System.out.println("A divisao de " + n1 + " por " + n2 + " é " + divisao(n1, n2));
                break;
            case 4:
                System.out.println("A Multiplicacao de " + n1 + " por " + n2 + " é " + multiplicacao(n1, n2));
                break;
            default:
                break;
        }
        
        entrada.close(); // Fechar o Scanner
    }
    
    public static double soma(double n1, double n2){
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2){
        return n1 - n2;
    }

    public static double divisao(double n1, double n2){
        if (n2 == 0) {
            System.out.println("Não é possível realizar divisão por 0");
            return 0;
        } else {
            double resultado = n1 / n2;
            return resultado;///////////////////
        }   
    }
    

    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }
}
