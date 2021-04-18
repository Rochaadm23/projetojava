package cursojava.executavel;

public class SplitArray {

	public static void main(String[] args) {
		
		/*Pega a String e quebra em um array*/
		String text =  "Fernando, curso Java, 80, 70, 90, 89";
		
		String[] valoreArray = text.split(",");
		
		for (int i = 0; i < valoreArray.length; i++) {
			
			System.out.println(valoreArray[i]);
		}
	}
	
	
}
