import java.util.Random;
import java.util.Scanner;

/**
 * Paciente
 */
public class Paciente {

    private int codigo;
    private String nome;

    Paciente() {
        codigo = 000000000;
        nome = "None";
    }

    // Paciente() {
    //     Random random = new Random();
        
    //     codigo = random.nextInt(20000000);
    //     nome = "P" + random.nextInt(1000);
    // }

    public void cadastrarPaciente(int contPa) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        codigo = contPa;
        
        System.out.printf("Digite o nome do médico: ");
        nome = scanner.nextLine();
    }

    @Override
    public String toString() {
        return  "\nCódigo: " + codigo +
                "\nNome Paciente: " + nome + "\n";
        }
}