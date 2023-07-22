public class ProperNesting{

    // if you are able to connect each left bracket
    // with each right bracket without interlink - then nesting is correct
    static void properNesting(String str){
        int count = 0;

        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == '(' ){
                count+=1;
            } else if (str.charAt(i) == ')') {
                count -=1;
            }
        }
        if(count < 0){
            System.out.println(" String is not properly nested ");
        }
        if (count >= 0){
            System.out.println(" String is properly nested ");
        }
    }

    public static void main(String[] args) {
        properNesting("(((shalom)))");

    }
}