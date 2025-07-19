package buscabinaria;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static int pesquisaBinaria(int[] vet, int valor) {
		
		// declaracao de variaveis
				int baixo = 0, resultado, cont = 0, chute, meio;
				int alto = vet.length - 1;
				
				while(baixo <= alto) {
					
					cont++;
					
					meio = (baixo + alto) / 2;
					chute = vet[meio];
					
					if (chute == valor){
						
						return meio;
						
					} else if (chute > valor) {
						
						alto = meio - 1;
						
					} else if (chute < valor){
						
						baixo = meio + 1;
					} else {
					
					return -1;
					}
	
				}
				return 0;
	}
	
	public static void main(String args[]) {
		
		// instanciado a classe scanner
		
		Scanner l = new Scanner(System.in);
		
		// declaracao de variaveis
		int n, valor;
		
		
		// leitura do tamanho do vetor
		System.out.println("Informe o tamanho do vetor: ");
		n = l.nextInt();
		int[] vetor = new int[n];
				
		// leitura dos elementos do vetor
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Diga o " + (i+1) + "o" + " valor: ");	
			vetor[i] = l.nextInt();
		}
		
		// ordenando o vetor
		Arrays.sort(vetor);
		
		
		// lendo o valor que queremos buscar
		System.out.println("Informe o número que devemos achar: ");
		valor = l.nextInt();

		
		// inicio da busca binaria 
		
		int cont = pesquisaBinaria(vetor, valor);
		
		if (cont != -1){
			// caso encontre
			System.out.println("Foram necessárias " + cont + " tentativas para encontrar o seu número.");
	
		} else {
			
			// caso nao encontre
			System.out.println("Opa! Parece que o número não está presente");
		}
	}
	
}
