public class CaesarCipher {

    static StringBuffer encrypt(String text, int s){
        StringBuffer result = new StringBuffer();
        for(int i =0; i < text.length(); ++i){
            if(Character.isUpperCase(text.charAt(i))){
                /* in ch we're storing new value,
                 calculated from the current one + shift
                */

                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else{
                char ch = (char) (((int) text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "ATTACKATONCE";
        int s = 4;  // symbol shift
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
}