package morseCode;

public class MorseCodeHandler {
	private String letter;
	
	public MorseCodeHandler()
	{
		this.letter = "";
	}
	
	/**
	 * 
	 * @param inputArray an integer array with a length of 5
	 * that contains numerical representations of morse code's dots and dashes.
	 */
	public void acceptInput(int[] inputArray)
	{
		String stringRepresentation = "";
		for(int x = 0; x<5; x++)
		{
			stringRepresentation += String.valueOf(inputArray[x]);
		}
		interpret(stringRepresentation);
	}
	
	/**
	 * 
	 * @param input The input in String form  
	 */
	
	public void interpret(String input)
	{
		/*
		 * random-ass if statements that convert the string of numbers representing dots and dashes
		 *into characters and appends them to the instance field this.letter.
		 */
		
		if(input.equals("01222"))
			this.letter += "a";
		if(input.equals("10002"))
			this.letter += "b";
		if(input.equals("10102"))
			this.letter += "c";
		if(input.equals("10022"))
			this.letter += "d";
		if(input.equals("02222"))
			this.letter += "e";
		if(input.equals("00102"))
			this.letter += "f";
		if(input.equals("11022"))
			this.letter += "g";
		if(input.equals("00002"))
			this.letter += "h";
		if(input.equals("00222"))
			this.letter += "i";
		if(input.equals("01112"))
			this.letter += "j";
		if(input.equals("10122"))
			this.letter += "k";
		if(input.equals("01002"))
			this.letter += "l";
		if(input.equals("11222"))
			this.letter += "m";
		if(input.equals("10222"))
			this.letter += "n";
		if(input.equals("11122"))
			this.letter += "o";
		if(input.equals("01102"))
			this.letter += "p";
		if(input.equals("11012"))
			this.letter += "q";
		if(input.equals("01022"))
			this.letter += "r";
		if(input.equals("00022"))
			this.letter += "s";
		if(input.equals("12222"))
			this.letter += "t";
		if(input.equals("00122"))
			this.letter += "u";
		if(input.equals("00012"))
			this.letter += "v";
		if(input.equals("01122"))
			this.letter += "w";
		if(input.equals("10012"))
			this.letter += "x";
		if(input.equals("10112"))
			this.letter += "y";
		if(input.equals("11002"))
			this.letter += "z";
		if(input.equals("01111"))
			this.letter += "1";
		if(input.equals("00111"))
			this.letter += "2";
		if(input.equals("00011"))
			this.letter += "3";
		if(input.equals("00001"))
			this.letter += "4";
		if(input.equals("00000"))
			this.letter += "5";
		if(input.equals("10000"))
			this.letter += "6";
		if(input.equals("11000"))
			this.letter += "7";
		if(input.equals("11100"))
			this.letter += "8";
		if(input.equals("11110"))
			this.letter += "9";
		if(input.equals("11111"))
			this.letter += "10";
	}
	
	public String getWord()
	{
		return this.letter;
	}
}
