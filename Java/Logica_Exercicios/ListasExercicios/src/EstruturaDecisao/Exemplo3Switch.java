package EstruturaDecisao;

public class Exemplo3Switch {

	public static void main(String[] args) {
	    int valor = 18;
		
		switch (valor) {
		case 1:
			System.out.println("Técnico");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Graduação");
			break;
		case 5:
		case 6:
		case 7:
			System.out.println("Lato Sensu");
			break;
		case 8:
			System.out.println("Stricto Sensu");
			break;
		default:
			System.out.println("Opção inválida");				
		}
	}

}
