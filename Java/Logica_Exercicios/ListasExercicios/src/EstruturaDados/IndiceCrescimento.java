package EstruturaDados;

public class IndiceCrescimento {

	public static void main(String[] args) {

		int[] crescimento = {100, 110, 115, 120, 140, 160, 200, 250, 290, 320, 350, 360};
		
		float indice=0;
		
		int crescimentoAnterior = crescimento[0];
		for (int i = 0; i < crescimento.length; i++) {
			
		    indice = (float) crescimento[i]/crescimentoAnterior; 
		    crescimentoAnterior=crescimento[i];  
		    
		    System.out.println(indice);
		}
	
		
	}

}
