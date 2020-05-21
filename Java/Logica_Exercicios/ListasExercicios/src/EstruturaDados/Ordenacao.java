package EstruturaDados;

public class Ordenacao {

	public static void main(String[] args) {

		int[] vet = {17, 32, 5, 87, 2, 48};

		int min, x, n=6;
        for (int i : vet) {
	        System.out.printf("%d |",i);
        }
		for (int i=0; i<n-1; i++){
	        min = i;
	        for (int j=i+1; j<n; j++){
	            if (vet[j] < vet[min]) {
	               min = j;
	           }
	        }
            x = vet[min];
	        vet[min] = vet[i];
	        vet[i] = x;
	        
	        System.out.println();
	        for (int item : vet) {
	        	System.out.printf("%d |",item);
	        }
     	}
	    //for (int i=0; i<n; i++) {
	    //	System.out.println(vet[i]);
	    //}
	}
}
