public class LastWordLength {
    public static void main(String[] args) {
//   Pre-defined method approach
        String s = "Hello WorldKlogo   ";
//       String[] strArr = str.split(" ");
//        System.out.println(strArr[strArr.length - 1].length());
        int i = s.length()-1;

        while(i>=0 && (s.charAt(i)) == ' '){
            --i;
        }
        int lastIndex = i;

        while(i>=0 && s.charAt(i) != ' '){
            --i;
        }
        System.out.println(lastIndex-i);
    }
}
