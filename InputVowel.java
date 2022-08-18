/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - Question no.1
*/ 
class InputVowel
{
	static void InputVowel()
	{
		char vowel = 'o'; //calling as a character
        int ascii = vowel; //taking as a integer
			if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ) //First Ifelse
				System.out.println(vowel + " is vowel");
				else
					System.out.println(vowel + " is consonant");
				if (ascii == 'a' || ascii == 'e'|| ascii == 'i' || ascii == 'o' || ascii  == 'u') //SecondIfElse
					System.out.println(ascii);
	}				 
		public static void main(String args[]) 
	{
		InputVowel();
	}
}