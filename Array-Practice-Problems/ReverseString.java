public class ReverseString {
    static void reverse(String str, String nstr){
        char ch;
        for(int i = 0;i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }

    public static void main(String[] args) {
        String str = "SANJAY";
        String nstr = "";
        reverse(str,nstr);
    }
}
