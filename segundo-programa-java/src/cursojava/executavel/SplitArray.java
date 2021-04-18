package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		/* Pega a String e quebra em um array */
		String text = "Fernando, curso Java, 80, 70, 90, 89";

		String[] valoreArray = text.split(",");

		for (int i = 0; i < valoreArray.length; i++) {

			System.out.println("Array " + valoreArray[i]);
		}

		/* Convertendo um Array em uma Lista */
		List<String> list = Arrays.asList(valoreArray);

		for (String Vrstring : list) {
			System.out.println("Lista " + Vrstring);

		}
		/* Convertendo uma lista em um Array */
		String[] convArray = list.toArray(new String[6]);
		for (int i = 0; i < convArray.length; i++) {
			System.out.println("Array novamente " + convArray[i]);
		}
	}

}
