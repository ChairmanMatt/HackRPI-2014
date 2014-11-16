package morseCode;

public class StringToMorseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Justin";
		StringToMorse convert = new StringToMorse(name);
		
		
		int[][] morseArray = convert.getMorseArray();
		for(int x = 0; x < name.length(); x++)
		{
			for(int y = 0; y < 5; y++)
			{
				System.out.print(convert.getMorseArray()[x][y]);
			}
			System.out.println();
		}
		
		MorseCodeHandler handler = new MorseCodeHandler();
		for(int x = 0; x<name.length(); x++)
		{
			handler.acceptInput(morseArray[x]);
		}
		System.out.println(handler.getWord());
	}

}
