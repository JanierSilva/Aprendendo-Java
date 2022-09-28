import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {

        int totalAlunos = 10;

        Scanner leiaNumero = new Scanner(System.in);

        while (totalAlunos > 0) {

            String nomeAluno = leiaNumero.nextLine();
            int idadeAluno = leiaNumero.nextInt();

            System.out.println("O nome do Aluno é: " + nomeAluno +", sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
            break;
        }
    }
}
