import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[][] alunos = new String[1][4];     // 1 aluno, 4 coluna
        System.out.println("Nome do Aluno: ");
        alunos[0][0] = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        alunos[0][1] = scanner.nextLine();
        double nota1 = Double.parseDouble(alunos[0][1]);

        System.out.println("Digite a segunda nota: ");
        alunos[0][2] = scanner.nextLine();
        double nota2 = Double.parseDouble(alunos[0][2]);

        double media = (nota1 + nota2)/2;       // Calculando a media
        String resultado = (media >=6.0) ?"Aprovado":"Reprovado";
        alunos[0][3] = resultado;

        System.out.println("\nResultado:");
        System.out.println("Aluno:" + alunos[0][0]);
        System.out.println("Situação:" + alunos[0][3]);

        scanner.close();
    }
}
