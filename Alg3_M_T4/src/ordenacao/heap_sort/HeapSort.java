package ordenacao.heap_sort;

public class HeapSort {

	public static <T extends Comparable<? super T>> void heapSort(T[] vetor) {
		buildMaxHeap(vetor);
		int n = vetor.length;

		for (int i = vetor.length - 1; i > 0; i--) {
			swap(vetor, i, 0);
			maxHeapify(vetor, 0, --n);
		}
	}

	private static <T extends Comparable<? super T>> void buildMaxHeap(
			T vetor[]) {
		for (int i = vetor.length / 2 - 1; i >= 0; i--)
			maxHeapify(vetor, i, vetor.length);
	}

	private static <T extends Comparable<? super T>> void maxHeapify(T[] vetor,
			int posicao, int n) {
		int maximo = 2 * posicao + 1, right = maximo + 1;
		if (maximo < n) {
			if (right < n && vetor[maximo].compareTo(vetor[right]) < 0)
				maximo = right;
			if (vetor[maximo].compareTo(vetor[posicao]) > 0) {
				swap(vetor, maximo, posicao);
				maxHeapify(vetor, maximo, n);
			}
		}
	}

	private static void swap(Object[] vetor, int j, int aposJ) {
		Object aux = vetor[j];
		vetor[j] = vetor[aposJ];
		vetor[aposJ] = aux;
	}

	public static void main(String[] args) {

		String[] vetor = { "Laranja", "Abacate", "Ma��", "Pera", "Lim�o",
				"Banana", "A�a�"};

		System.out.println("Vetor antes: \n");
		for (int i = 0; i < vetor.length; i++) {

			System.out.print(vetor[i] +", ");
		}

		heapSort(vetor);

		System.out.println("\n\nVetor ordenado com o Heap Sort: \n");
		for (int i = 0; i < vetor.length; i++) {

			System.out.print(vetor[i] +", ");
		}

	}

}