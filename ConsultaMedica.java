/**
 * ConsultaMedica
 */
public class ConsultaMedica {

    private int numeroConsulta;
    private int dataConsulta;
    private int horaConsulta;
    private String paciente;
    private String medico;

    @Override
    public String toString() {
        return  "\nData da Consulta: " + dataConsulta + 
                "\nHora da Consulta: " + horaConsulta + 
                "\nNome do Médico: " + medico +
                "\nNúmero da Consulta: " + numeroConsulta + 
                "\nNome do Paciente: " + paciente;
    }

    
}