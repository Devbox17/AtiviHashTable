import java.util.Random;

/**
 * Paciente
 */
public class Paciente {

    private int codigo;
    private String nome;

    // Paciente() {
    //     codigo = 000000000;
    //     nome = "None";
    // }

    Paciente() {
        Random random = new Random();
        
        codigo = random.nextInt(20000000);
        nome = "P" + random.nextInt(1000);
    }

    @Override
    public String toString() {
        return  "\nNome Paciente: " + nome +
                "\nCódigo: " + codigo;
    }
}