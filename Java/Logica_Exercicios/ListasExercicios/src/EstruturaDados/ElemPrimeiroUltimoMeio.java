package EstruturaDados;

public class ElemPrimeiroUltimoMeio {

	public static void main(String[] args) {
		
		int [] idade = {20, 25, 28, 31, 10, 40, 18, 15, 45, 93, 54, 41 };
		
		int meio = idade.length / 2;
		System.out.println(meio);
		
		System.out.printf("\nPrimeiro elemento: %d", idade[0]);
		System.out.printf("\nElemento do meio : %d", idade[meio]);		
		System.out.printf("\nÚltimo elemento  : %d", idade[idade.length - 1]);
		
	}

}
