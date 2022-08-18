/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - Question no.1
*/ 
class InputVowel
{
	static void InputVowel()
	{
		char vowel = 'o';
        int ascii = vowel;
			if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' )
				System.out.println(vowel + " is vowel");
				else
					System.out.println(vowel + " is consonant");
				if (ascii == 'a' || ascii == 'e'|| ascii == 'i' || ascii == 'o' || ascii  == 'u')
					System.out.println(ascii);
	}				 
		public static void main(String args[]) 
	{
		InputVowel();
	}
}