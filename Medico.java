import java.util.Random;

/**
 * Medico
 */
public class Medico {

    private int CRM;
    private String nome;
    private String especialidade;

    // Medico() {
    //     CRM = 00000000000;
    //     nome = "None";
    //     especialidade = "None";
    // }

    Medico() {
        Random random = new Random();

        CRM = random.nextInt(20000000);
        nome = "M" + random.nextInt(1000);
        especialidade = "E" + random.nextInt(1000);
    }

    @Override
    public String toString() {
        return  "\nNome Médico: " + nome +
                "\nCRM: " + CRM + 
                "\nEspecialidade: " + especialidade;
    }
}