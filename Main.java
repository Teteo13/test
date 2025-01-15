package sigtask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Agenda agenda = new Agenda();
       
       System.out.print("Insira o nome da tarefa: ");
       String nome = scanner.next();
       System.out.print("Insia o horário da reunião: ");
       String horario = scanner.next();
       System.out.print("Insira quantos dias na semana: ");
       int dias = scanner.nextInt();
       
       agenda.adicionarTarefaSemanal(nome, horario, dias);
       agenda.mostrarTarefasSemanais();
    }
}
