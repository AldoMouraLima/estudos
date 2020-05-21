package EstruturaRepeticao;

import java.util.Scanner;

public class CriticaHorario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String horario;
		boolean erro=false;
		do {
		
			// entrada
			//                                              01234567
			System.out.println("Informe uma data no formato HH:MM:SS\nInforme 99 para finalizar");
			horario = ler.next();
			if (horario.equals("99")) {
				break;
			}
			
			// críticas: Se alguma der verdadeira, muda o status da variavel erro para true
			if (horario.length()!=8) {
				System.out.println("Horário com tamanho errado. Digite até 8 posições.");
				continue;
			}

			int horaInt    = Integer.parseInt(horario.substring(0,2));
			int minutoInt  = Integer.parseInt(horario.substring(3,5));
			int segundoInt = Integer.parseInt(horario.substring(6,8));
			
			if (horaInt<0 || horaInt>23) {
				System.out.println("Hora incorreta");
				erro=true;
			}
			
			if (minutoInt<0 || minutoInt>59) {
				System.out.println("Minutos incorretos");
				erro=true;
			}
			if (segundoInt<0 || segundoInt>23) {
				System.out.println("Segundos incorretos");
				erro=true;
			}
			
			String primeiroSeparador = horario.substring(2,3);
			String segundoSeparador  = horario.substring(5,6);

			if (!(primeiroSeparador.equals(":"))  || !(segundoSeparador.equals(":"))) {			
				System.out.println("Horário incorreto. Informe os separadores com :");
				erro=true;
			}

					
			
			if (erro==false) {
				break;
			}
			
			
		}while(true);
		if (!(horario.equals("99"))) {
			System.out.println("Horário correto!!!");
			//....
		}

	}

}
