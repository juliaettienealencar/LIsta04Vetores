package pctExercício03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {10,6,66,14,77,9};
		int maior = vetor[0];
		
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				
			}
		}
		System.out.println("o maior valor é: " + maior);
	}

}
