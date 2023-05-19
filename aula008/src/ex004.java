import java.util.Scanner;

public class ex004 {

    private String nome;
    private double nota1;
    private double nota2;
    
    public ex004(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Media dos 5 alunos");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome do Aluno: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("As notas devem estar entre 1 e 10");
                System.exit(0);
            }

            System.out.print("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("As notas devem estar entre 1 e 10");
                System.exit(0);
            }

            entrada.nextLine();

            ex004 ojetoDosAlunos = new ex004(nome, nota1, nota2);

            System.out.println("O aluno " + ojetoDosAlunos.getNome() + " Obteve a media: " + ojetoDosAlunos.calcularMedia());
        }
        entrada.close();
    }
}
