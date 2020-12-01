import java.util.Random;
import java.util.Scanner;

/**
 * Medico
 */
public class Medico {

    private int CRM;
    private String nome;
    private String especialidade;

    Medico() {
        CRM = 00000000000;
        nome = "None";
        especialidade = "None";
    }

    // Medico() {
    //     Random random = new Random();

    //     CRM = random.nextInt(20000000);
    //     nome = "M" + random.nextInt(1000);
    //     especialidade = "E" + random.nextInt(1000);
    // }

    public void cadastrarMedico(int contMe) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        CRM = contMe;

        System.out.printf("Digite o nome do médico: ");
        nome = scanner.nextLine();

        System.out.printf("Digite a especialidade do médico: ");
        especialidade = scanner.nextLine();
    }

    @Override
    public String toString() {
        return  "\nCRM: " + CRM + 
                "\nNome Médico: " + nome +
                "\nEspecialidade: " + especialidade + "\n";
    }
}