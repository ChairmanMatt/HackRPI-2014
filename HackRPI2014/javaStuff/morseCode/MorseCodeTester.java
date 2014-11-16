package morseCode;

public class MorseCodeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MorseCodeHandler morse = new MorseCodeHandler();
		
		int[] demoArray = {0, 1, 2, 2, 2};	//the morse code input for the character 'a', where 0 is dot, 1 is dash, and 2 is empty input
		morse.acceptInput(demoArray);
		
		System.out.println(morse.getWord());
	}

}
