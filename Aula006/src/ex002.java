import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema da loja!!!");
        
        System.out.println("Informe o valor da compra: ");
        double ValorDaCompra = entrada.nextDouble();
        System.out.println("Informe o metodo de pagamento");
        System.out.println("1- Em dinheiro (30% de desconto)\n2- Cartao de debito (25% de desconto)\n3- cartao de credito (20% de desconto)");
        int OpcaoDePagamento = entrada.nextInt();
        switch (OpcaoDePagamento) {
            case 1:
                double descontoEmDinheiro = ValorDaCompra * 0.3;
                double valorFinalDinheiro = ValorDaCompra - descontoEmDinheiro;
                System.out.println("O valor a pagar com desconto sera de R$ " + valorFinalDinheiro);
                    break;
            case 2:
                double descontoEmDebito = ValorDaCompra * 0.25;
                double valorFinalDebito = ValorDaCompra - descontoEmDebito;
                System.out.println("O valor a pagar com desconto sera de R$ " + valorFinalDebito);
                    break;
            case 3:
                double descontoEmCredito = ValorDaCompra * 0.3;
                double valorFinalCredito = ValorDaCompra - descontoEmCredito;
                System.out.println("O valor a pagar com desconto sera de R$ " + valorFinalCredito);
                    break;
            default:
                System.out.println("Nao é possivel realizar a compra!");
                break;
        }     
        entrada.close();
    }
}
