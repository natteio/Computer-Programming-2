package vigenere_cipher;

import java.util.Scanner;

public class vigenere_cipher {
	static String Generate_Key (String str, String key) {
		// class generates key until input str = key str
		int x = str.length();
		
		for (int i=0; ; i++) {
			if (x==i)
				i = 0;
			
			if (key.length() == str.length())
				break;
			
			key += (key.charAt(i));
		}
		return key;
	}
	static String Cipher_Text (String str, String key) {
		// returns encypted text generated from key
		String cipher_text ="";
		
		for (int i=0; i<str.length(); i++) {
			int x = (str.charAt(i) + key.charAt(i)) % 26; // convert text in range 0-25
			x += 'A';
			cipher_text += (char)(x);
		}
		return cipher_text;
	}
	static String original_Text (String cipher_text, String key) {
		String original_text ="";
		
		for (int i=0; i<cipher_text.length() &&  i<key.length();i++) {
			int x = (cipher_text.charAt(i) - key.charAt(i) + 26) % 26; // converting text in range 0-25
			x += 'A';
			original_text += (char)(x);
		}
		return original_text;
	}
	static String LowerToUpperCase (String S) {
		StringBuffer str = new StringBuffer(S);
		
		for (int i=0; i<S.length();i++) {
			if (Character.isLowerCase(S.charAt(i)))
				str.setCharAt(i, Character.toUpperCase(S.charAt(i)));
		}
		S = str.toString();
		return S;
	}
	public static void main (String [] args) {

		Scanner scan = new Scanner(System.in);

        System.out.print("Input text: ");
        String Str = scan.nextLine();

        System.out.print("Input key: ");
        String KEY = scan.nextLine();


        String str1 = LowerToUpperCase(Str);
        String key1 = LowerToUpperCase(KEY);

        String key = Generate_Key(str1, key1);
        String cipher_text = Cipher_Text(str1, key);

        System.out.println();
        System.out.println("Text: "+ str1);
        System.out.println("Key: "+ key1);
        System.out.println("Ciphertext : "+ cipher_text);
        System.out.println("Original/Decrypted Text : "+ original_Text(cipher_text, key));
	    }
}
