
public class VigenereCipher {
	
	// This function generates the key in
	// a cyclic manner until it's length isn't
	// equal to the length of original text
	
	static String generateKey(String str, String key) {
		int x = str.length();
		for(int i = 0; ; ++i) {
			if(x==i) {
				i = 0;
			}
			if(key.length() == str.length()) {
				break;
			}
			key += key.charAt(i);
		
		}
		return key;		
	}
	
	/*
	 * This function return an encrypted text
	 * generated with the use of the key
	*/
	static String cipherText(String str, String key) {
		String cipher_txt = "";
		
		for(int i = 0; i < str.length();++i) {
			
			int x = (str.charAt(i)+key.charAt(i))%26;  // converting in range 0-25
			
			x+='A'; // convert into alphabets(ASCII)
			cipher_txt += (char)(x);
		}
		
		return cipher_txt;
	}
	
	/*
	 * Function to decrypt the encrypted text
	 * and return the original text
	 */
	static String origText(String cipher_txt, 
			String key) {
		String origTxt = "";
		
		for(int i = 0; i < cipher_txt.length() && i < key.length(); ++i) {
			int x = (cipher_txt.charAt(i) - 
					key.charAt(i)+26)%26;
			x+='A';
			origTxt +=(char)x;
		}
	
		return origTxt;
	}
	
	// Function to convert lower_case to upper_case
	
	static String LowToUpp(String s) {
		StringBuffer str = new StringBuffer(s);
		for(int i = 0; i <s.length(); ++i) {
			if(Character.isLowerCase(s.charAt(i))) {
				str.setCharAt(i,Character.toUpperCase(s.charAt(i)));
			}
		}
		s = str.toString();
		return s;
	}
	
	
	public static void main(String[] args) {
		String Str = "GEEKSFORGEEKS";
	    String Keyword = "AYUSH";
	       
	      String str = LowToUpp(Str);
	      String keyword = LowToUpp(Keyword);
	 
	    String key = generateKey(str, keyword);
	    String cipher_text = cipherText(str, key);
	 
	    System.out.println("Ciphertext : "
	        + cipher_text + "\n");
	 
	    System.out.println("Original/Decrypted Text : "
	        + origText(cipher_text, key));
	}

}
