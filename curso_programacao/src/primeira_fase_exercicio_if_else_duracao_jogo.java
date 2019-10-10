import java.util.Scanner;

public class primeira_fase_exercicio_if_else_duracao_jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas vocês começaram a jogar?");
		int horaInicio = sc.nextInt();

		System.out.println("Que horas vocês pararam a jogar?");
		int horaFinal = sc.nextInt();
		
		int totalDeHorasDia = 24;
		
		int horasJogadas;
		
		if(horaInicio < horaFinal) {
			
			horasJogadas = horaFinal - horaInicio;
			
		} else {
			
			horasJogadas = totalDeHorasDia - horaInicio + horaFinal;
		}
		
		System.out.println("O total de horas jogadas foi: " + horasJogadas);
	
		sc.close();
		
	}

}
