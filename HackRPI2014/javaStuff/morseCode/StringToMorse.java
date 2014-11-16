package morseCode;

public class StringToMorse {
	
	private String inputWord;
	
	public StringToMorse(String inputWord)
	{
		this.inputWord = inputWord.toLowerCase();
	}
	
	public int[][] getMorseArray()
	{
		int[][] returnArray = new int[this.inputWord.length()][5];
		
		for(int x = 0; x < inputWord.length(); x++)
		{
			returnArray[x] = decode(this.inputWord.charAt(x));
		}
		
		return returnArray;
	}
	
	private int[] decode(char letter)
	{
			if(letter == 'a')
			{
				int[] returnArray = {0, 1, 2, 2, 2};
				return returnArray;
			}
			else if(letter == 'b')
			{
				int[] returnArray = {1, 0, 0, 0, 2};
				return returnArray;
			}
			else if(letter == 'c')
			{
				int[] returnArray = {1, 0, 1, 0, 2};
				return returnArray;
			}
			else if(letter == 'd')
			{
				int[] returnArray = {1, 0, 0, 2, 2};
				return returnArray;
			}
			else if(letter == 'e')
			{
				int[] returnArray = {0, 2, 2, 2, 2};
				return returnArray;
			}
			else if(letter == 'f')
			{
				int[] returnArray = {0, 0, 1, 0, 2};
				return returnArray;
			}
			else if(letter == 'g')
			{
				int[] returnArray = {1,1,0,2,2};
				return returnArray;
			}
			else if(letter == 'h')
			{
				int[] returnArray = {0,0,0,0,2};
				return returnArray;
			}
			else if(letter == 'i')
			{
				int[] returnArray = {0,0,2,2,2};
				return returnArray;
			}
			else if(letter == 'j')
			{
				int[] returnArray = {0,1,1,1,2};
				return returnArray;
			}
			else if(letter == 'k')
			{
				int[] returnArray = {1,0,1,2,2};
				return returnArray;
			}
			else if(letter == 'l')
			{
				int[] returnArray = {0,1,0,0,2};
				return returnArray;
			}
			else if(letter == 'm')
			{
				int[] returnArray = {1,1,2,2,2};
				return returnArray;
			}
			else if(letter == 'n')
			{
				int[] returnArray = {1,0,2,2,2};
				return returnArray;
			}
			else if(letter == 'o')
			{
				int[] returnArray = {1,1,1,2,2};
				return returnArray;
			}
			else if(letter == 'p')
			{
				int[] returnArray = {0,1,1,0,2};
				return returnArray;
			}
			else if(letter == 'q')
			{
				int[] returnArray = {1,1,0,1,2};
				return returnArray;
			}
			else if(letter == 'r')
			{
				int[] returnArray = {0,1,0,2,2};
				return returnArray;
			}
			else if(letter == 's')
			{
				int[] returnArray = {0,0,0,2,2};
				return returnArray;
			}
			else if(letter == 't')
			{
				int[] returnArray = {1,2,2,2,2};
				return returnArray;
			}
			else if(letter == 'u')
			{
				int[] returnArray = {0,0,1,2,2};
				return returnArray;
			}
			else if(letter == 'v')
			{
				int[] returnArray = {0,0,0,1,2};
				return returnArray;
			}
			else if(letter == 'w')
			{
				int[] returnArray = {0,1,1,2,2};
				return returnArray;
			}
			else if(letter == 'x')
			{
				int[] returnArray = {1,0,1,1,2};
				return returnArray;
			}
			else if(letter == 'y')
			{
				int[] returnArray = {1,0,1,1,2};
				return returnArray;
			}
			else
			{
				int[] returnArray = {1,1,0,0,2};
				return returnArray;
			}
		
	}
}
