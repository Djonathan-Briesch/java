// Djonathan Briesch e Andrey Brum

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o dia da semana: ");
        System.out.println("1 - Segunda a sexta");
        System.out.println("2 - Sabado e domingo");
        int DiaDaSemana = entrada.nextInt();
        if (DiaDaSemana == 1 || DiaDaSemana == 2) {
        System.out.println("Informe a velocida em Km/h: ");
        int velocidade = entrada.nextInt();
        switch (DiaDaSemana) {
            case 1:
            if (velocidade > 0){
                if (velocidade <= 30) {
                    System.out.print("Sem multa");
                } else if (velocidade <= 36) {
                    System.out.print("Você recebeu uma multa de R$ 85,13 e 4 pontos na carteira");
                } else if (velocidade <= 45) {
                    System.out.print("Você recebeu uma multa de R$ 127,69 e 5 pontos na carteira");
                } else {
                    System.out.print("Você recebeu uma multa de R$ 321,45 e 8 pontos na carteira");
                }
            } else {
                System.out.println("Nao funfo");
            }
                break;
            case 2:
            if (velocidade > 0){
                if (velocidade <= 50) {
                    System.out.print("Sem multa");
                } else if (velocidade <= 60) {
                    System.out.print("Você recebeu uma multa de R$ 85,13 e 4 pontos na carteira");
                } else if (velocidade <= 75) {
                    System.out.print("Você recebeu uma multa de R$ 127,69 e 5 pontos na carteira");
                } else {
                    System.out.print("Você recebeu uma multa de R$ 321,45 e 8 pontos na carteira");
                }
            } else {
                System.out.println("Nao funfo");
            }
                break;

            default:
                System.out.println("Algo deu errado");
                break;
                }
            } else {
                System.out.print("Opcao invalida");
            }
            entrada.close();
        }
}
