import java.util.Scanner;

public class ex004 { // Caixa registradora
    public static void main(String[] args) {
        System.out.println(" \tBem vindo ao nosso caixa eletronico!!!\n");
        System.out.println("Informe o valor que deseja sacar: ");
        System.out.println("As posiveis notas de saque são: \nR$100, R$50, R$20, R$10, R$5 e R$2");

        Scanner entrada = new Scanner(System.in);
        int valorSaque  = entrada.nextInt();

        int restoDiv5   = valorSaque % 5; // Verifica se o valor digitado é divisivel por 5
        int restoDiv2   = valorSaque % 2; // Verifica se o valor digitado é divisivel por 2

        if (valorSaque > 0 && (restoDiv5 == 0 || restoDiv2 == 0)) {
            int notasDe100          = valorSaque / 100;                 // Calculo para saber quantas notas de 100 deve retirar
            int notasDezena         = valorSaque % 100;                 // Calculo para saber a Dezena do numero digitado pelo ususario
            int notasUnidade        = notasDezena % 10;                 // calculo para saber a unidade do numero digitado pelo ususario
            int resultadoDezena     = notasDezena - notasUnidade;       // claculo para separar a unidade da dezena 

            String resultadoDasNotasDaDezena    = resultadoDasNotasDaDezena(resultadoDezena); // Atribuindo o resultado da funcaoe das dezenas a variavel
            String resultadoDasNotasDaUnidade   = resultadoDasNotasDaUnidade(notasUnidade); // Atribuindo o resultado da funcaoe das unidades a variavel

            System.out.println("Você vai receber as seguntes notas:");// Exibindo o resultado na tela
            System.out.println(notasDe100 + " notas de R$100"); 
            System.out.println(resultadoDasNotasDaDezena);
            System.out.println(resultadoDasNotasDaUnidade);
        } else {
            System.out.print("Valor invalido, Insira outro valor que seja divisivel por 2 ou por 5"); // Caso o valor digitado nao corresponda ao resultado posiveios
        }
        entrada.close();    
    }
    public static String resultadoDasNotasDaDezena(int resultadoDezena) { // Funcao para saber quais notas da casa das dezenas usar
        String resultado = "";
    
        switch (resultadoDezena) {
            case 10:
                resultado += "1 nota de R$10";
                break;
            case 20:
                resultado += "1 nota de R$20";
                break;
            case 30:
                resultado += "1 nota de R$20\n 1 de R$10";
                break;
            case 40:
                resultado += "2 nota de R$20";
                break;
            case 50:
                resultado += "1 nota de R$50";
                break;    
            case 60:
                resultado += "1 nota de R$50\n 1 de R$10";
                break;
            case 70:
                resultado += "1 nota de R$50\n 1 de R$20";
                break;
            case 80:
                resultado += "1 nota de R$50\n 1 de R$20\n 1 de R$10";
                break;
            case 90:
                resultado += "1 nota de R$50\n 2 de R$20";
                break;
            default:
                resultado += "Algo de errado!!!";
                break;
        }
    
        return resultado;
    }
    
    public static String resultadoDasNotasDaUnidade(int notasUnidade){ // Funcao para saber quais notas da casa das unidades usar
        String resultado = "";

        switch (notasUnidade) {
            case 2:
                resultado += "1 nota de R$2";
                break;
            case 4:
                resultado += "2 notas de R$2";
                break;
            case 5:
                resultado += "1 nota de R$5";
                break;
            case 6:
                resultado += "3 notas de R$2";
                break;
            case 7:
                resultado += "1 nota de R$5\n1 nota de R$2";
                break;
            case 8:
                resultado += "4 notas de R$2";
                break;
            case 9:
                resultado += "1 nota de R$5\n2 notas de R$2";
                break;
            default:
                resultado += "Algo deu errado!!!";
                break;
        }
        return resultado;
    }
}
