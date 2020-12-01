import java.util.Hashtable;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Hashtable<Integer, ConsultaMedica> laudoMedico = new Hashtable<Integer, ConsultaMedica>();
        Hashtable<Integer, Paciente> infoPaciente = new Hashtable<Integer, Paciente>();
        Hashtable<Integer, Medico> infoMedico = new Hashtable<Integer, Medico>();
        int opcao = 0, contPa = 0, contMe = 0, contCM = 0;

        menu(opcao, contPa, contMe, contCM, laudoMedico, infoPaciente, infoMedico);
    }

    public static void menu(int opcao, int contPa, int contMe, int contCM,
            Hashtable<Integer, ConsultaMedica> laudoMedico, Hashtable<Integer, Paciente> infoPaciente,
            Hashtable<Integer, Medico> infoMedico) {
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
                    contPa = inserirPaciente(contPa, infoPaciente);
                    mostrarPaciente(infoPaciente);
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 2:
                    contMe = inserirMedico(contMe, infoMedico);
                    mostrarMedico(infoMedico);
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 3:
                    contCM = inserirConsultaMedica(contCM, laudoMedico);
                    relatorioLaudo(laudoMedico);
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                // case 4:

                // break;

                // case 5:

                // break;
            }
        } while (opcao < 6);
    }

    public static int inserirPaciente(int contPa, Hashtable<Integer, Paciente> infoPaciente) {
        Paciente paciente = new Paciente();

        paciente.cadastrarPaciente(contPa);
        infoPaciente.put(contPa, paciente);
        contPa++;

        return contPa;
    }

    public static int inserirMedico(int contMe, Hashtable<Integer, Medico> infoMedico) {
        Medico medico = new Medico();

        medico.cadastrarMedico(contMe);
        infoMedico.put(contMe, medico);
        contMe++;

        return contMe;
    }

    public static int inserirConsultaMedica(int contCM, Hashtable<Integer, ConsultaMedica> laudoMedico) {
        ConsultaMedica consultaMedica = new ConsultaMedica();

        consultaMedica.cadastrarConsultaMedica(contCM);
        laudoMedico.put(contCM, consultaMedica);
        contCM++;

        return contCM;
    }

    public static void mostrarPaciente(Hashtable<Integer, Paciente> infoPaciente) {
        for (Paciente paciente : infoPaciente.values()) {
            System.out.printf(paciente.toString());
        }
    }

    public static void mostrarMedico(Hashtable<Integer, Medico> infoMedico) {
        for (Medico medico : infoMedico.values()) {
            System.out.printf(medico.toString());
        }
    }

    public static void relatorioLaudo(Hashtable<Integer, ConsultaMedica> laudoMedico) {
        for (ConsultaMedica consultaMedica : laudoMedico.values()) {
            System.out.printf(consultaMedica.toString());
        }
    }
}