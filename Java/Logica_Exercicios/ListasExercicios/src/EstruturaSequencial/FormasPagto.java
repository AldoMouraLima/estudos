package EstruturaSequencial;
import java.util.Scanner;

public class FormasPagto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float valorVenda;
		
		System.out.print("Valor da venda R$ ");
		valorVenda = teclado.nextFloat();
		
		float valorDesconto = valorVenda * 5 / 100;
		float valorAVista = valorVenda - valorDesconto;
		float parcelado2x = valorVenda / 2;
		float parcelado3x = valorVenda / 3;
		
		System.out.printf("\n¿ vista R$ %8.2f", valorAVista);
		System.out.printf("\n    2 x R$ %8.2f", parcelado2x);
		System.out.printf("\n    3 x R$ %8.2f", parcelado3x);
		
		
		teclado.close();
	}

}
