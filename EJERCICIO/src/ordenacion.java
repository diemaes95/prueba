
public class ordenacion {


	
	public static void burbujaDesc(int[] array) {
	for (int i = 0; i < array.length - 1; i++) {
		for (int j = 0; j <= array.length - i - 2; j++)
			if (array[j + 1] > array[j]) {
				tmp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = tmp;
			}
		}
	}


}
