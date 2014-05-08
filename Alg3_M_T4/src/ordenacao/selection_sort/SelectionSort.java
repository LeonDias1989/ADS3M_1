package ordenacao.selection_sort;

public class SelectionSort {

	private int[] vetor;

	public SelectionSort(int[] vetor) {
		super();
		this.vetor = vetor;
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public void ordenar() {
		int minimo, aux;

		for (int i = 0; i < vetor.length - 1; i++) {
			minimo = i;

			for (int j = i + 1; j < vetor.length; j++)

				if (vetor[j] < vetor[minimo])
					minimo = j;

			if (minimo != i) {
				aux = vetor[minimo];
				vetor[minimo] = vetor[i];
				vetor[i] = aux;
			}
		}
	}

	public static void main(String[] args) {

		int[] vetor = { 6, 2, 1, 8, 4, 5, 9, 3, 7, 10 };

		SelectionSort ss = new SelectionSort(vetor);

		System.out.println("Antes de Ordenar: \n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		ss.ordenar();

		System.out.println("\nDepois de Ordenar: \n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

}