import java.util.Random;

/**
 * ConsultaMedica
 */
public class ConsultaMedica {

    private int numeroConsulta;
    private String dataConsulta;
    private String horaConsulta;
    private int paciente;
    private int medico;

    ConsultaMedica() {
        numeroConsulta = 00000000;
        dataConsulta = "00/00/0000";
        horaConsulta = "00:00";
        paciente = 0;
        medico = 0;
    }

    // ConsultaMedica() {
    //     Random random = new Random();
        
    //     numeroConsulta = random.nextInt(20000000);
    //     dataConsulta = random.nextInt(32) + "/" + random.nextInt(13) + "/" + "2020";
    //     horaConsulta = random.nextInt(25) + ":" + random.nextInt(60);
    //     paciente = random.nextInt(200);
    //     medico = random.nextInt(200);
    // }

    public void cadastrarConsultaMedica(int contCM, int valorPaciente, int valorMedico) {
        Random random = new Random();
        
        numeroConsulta = contCM;
        dataConsulta = random.nextInt(32) + "/" + random.nextInt(13) + "/" + "2020";
        horaConsulta = random.nextInt(25) + ":" + random.nextInt(60);
        paciente = valorPaciente;
        medico = valorMedico;
    }

    @Override
    public String toString() {
        return  "\nNúmero da Consulta: " + numeroConsulta + 
                "\nData da Consulta: " + dataConsulta + 
                "\nHora da Consulta: " + horaConsulta + 
                "\nPaciente: " + paciente + 
                "\nMédico: " + medico + "\n";
    }
}