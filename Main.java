import java.util.Hashtable;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        ConsultaMedica consultaMedica = new ConsultaMedica();
        Hashtable<Integer, ConsultaMedica> laudoMedico = new Hashtable<Integer, ConsultaMedica>();
        Hashtable<Integer, Paciente> infoPaciente = new Hashtable<Integer, Paciente>();
        Hashtable<Integer, Medico> infoMedico = new Hashtable<Integer, Medico>();
        int opcao = 0, contPa = 0, contMe = 0, contCM = 0;

        menu(opcao, contPa, contMe, contCM, paciente, medico, consultaMedica, laudoMedico, infoPaciente, infoMedico);
    }

    public static void menu(int opcao, int contPa, int contMe, int contCM, Paciente paciente, Medico medico,
            ConsultaMedica consultaMedica, Hashtable<Integer, ConsultaMedica> laudoMedico,
            Hashtable<Integer, Paciente> infoPaciente, Hashtable<Integer, Medico> infoMedico) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\n______________Atividade HashTable_____________");
            System.out.println("|                                            |");
            System.out.println("|    1° - Registrar Paciente                 |");
            System.out.println("| 2° - Registrar Médico |");
            System.out.println("| 3° - Registrar Nova Consulta Médica |");
            // System.out.println("| 4° - Remove Consulta Médica |");
            // System.out.println("| 5° - Listar Consulta Médica |");
            // System.out.println("| 6° - Sair do Programa |");
            // System.out.println("|____________________________________________|");
            System.out.printf("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contPa = inserirPaciente(contPa, paciente, infoPaciente);
                    break;

                case 2:
                    contMe = inserirMedico(contMe, medico, infoMedico);
                    break;

                case 3:
                    contCM = inserirConsultaMedica(contCM, consultaMedica, laudoMedico);
                    break;

                // case 4:

                // break;

                // case 5:

                // break;
            }
        } while (opcao < 6);
    }

    public static int inserirPaciente(int contPa, Paciente paciente, Hashtable<Integer, Paciente> infoPaciente) {
        paciente = new Paciente();
        infoPaciente.put(contPa, paciente);
        contPa++;

        return contPa;
    }

    public static int inserirMedico(int contMe, Medico medico, Hashtable<Integer, Medico> infoMedico) {
        medico = new Medico();
        infoMedico.put(contMe, medico);
        contMe++;

        return contMe;
    }

    public static int inserirConsultaMedica(int contCM, ConsultaMedica consultaMedica,
            Hashtable<Integer, ConsultaMedica> laudoMedico) {
        consultaMedica = new ConsultaMedica();
        laudoMedico.put(contCM, consultaMedica);
        contCM++;

        return contCM;
    }

    public static void mo(int contPa, Hashtable<Integer, Paciente> infoPaciente) {
        for (Paciente paciente : infoPaciente.values()) {
            System.out.printf(paciente.toString());
        }
    }
}