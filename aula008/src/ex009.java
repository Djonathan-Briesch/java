public class ex009 {
    public static void main(String[] args) {
        int n = 20; 
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Os " + n + " primeiros números da série de Fibonacci:");

        
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
    }
}
