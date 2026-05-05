package pctExercicio01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		int[] vetor = new int[5];
		for(int i=0; i < vetor.length; i++) {
			System.out.println("digite um numero inteiro");
			vetor[i]=receba.nextInt();
		
		}
		for(int i=0; i<vetor.length; i++) {
			System.out.println("você digitou os números: "+i+ " = " + vetor[i]);
			
		}
	}

}
