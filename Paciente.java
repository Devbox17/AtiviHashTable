/**
 * Paciente
 */
public class Paciente {

    private int codigo;
    private String nome;

    @Override
    public String toString() {
        return  "\nNome Paciente: " + nome +
                "\nCódigo: " + codigo;
    }
}