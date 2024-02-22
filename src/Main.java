import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de media do ensino fundamental!!!");
        System.out.println("Voce e aluno do ensino fundamental? Digite 1 para sim e 2 para nao.");
        double ehAlunoDoEnsinoFundamental = scanner.nextDouble();

        if (ehAlunoDoEnsinoFundamental == 1) {

            double mediaDoFundamental = capturaDeNotaDoEnsinoFundamental() / 8;
            avaliaMediaDoAluno(mediaDoFundamental);

        } else {
            System.out.println("Nao faz parte do Ensino Fundamental");
        }

    }

    public static double capturaDeNotaDoEnsinoFundamental() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi sua nota em Matematica? ");
        double notaDeMatematica = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Ciencias? ");
        double notaDeCiencias = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Portugues? ");
        double notaDePortugues = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Historia? ");
        double notaDeHistoria = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Geografia? ");
        double notaDeGeografia = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Artes? ");
        double notaDeArtes = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Ingles? ");
        double notaDeIngles = scanner.nextDouble();

        System.out.println("Qual foi sua nota em Educacao Fisica? ");
        double notaDeEdFisica = scanner.nextDouble();

        return notaDeMatematica + notaDeCiencias + notaDePortugues + notaDeHistoria
                + notaDeGeografia + notaDeArtes + notaDeIngles + notaDeEdFisica;
    }

    public static void avaliaMediaDoAluno(double media) {
        System.out.println("A media de todas as materias eh: " + media);

        if (media < 7) {
            System.out.println("Voce foi reprovado!!!");
        } else if (media < 9) {
            System.out.println("Boa nota vc esta aprovado!!!");
        } else {
            System.out.println("Exelente nota!!!");
        }
    }
}