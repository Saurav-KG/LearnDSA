public class ValidPalindrome {
    public static void main(String[] args) {
    /* This approach works but we will use some other approach where we wont take extra space for array
        String s = "P0";
        s = s.toUpperCase();
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int asciival = s.charAt(i);
            if(asciival >= 65 && asciival <=90){
                arr.add(s.charAt(i));
            }
            else if(asciival >= 48 && asciival <=57){
                arr.add(s.charAt(i));
            }
        }
//        Character.isLetterOrDigit()
        //Lets play pointer game
        int i= 0;
        int j = arr.size()-1;
        boolean flag = true;
        while(i<=j){
            if(arr.get(i) == arr.get(j)){
                i++;
                j--;
                continue;
            }
            else{
                flag = false;
                break;
            }
        }
        System.out.println(arr);
        System.out.println(flag);
*/
        String s = "A man, a plan, a canal: Panama";
        int start = 0;
        int end = s.length() - 1;
        boolean flag = true;

        while(start < end){
            if(! Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            else if(! Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            else{
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    System.out.println("Not Palidrome");
                    flag = false;
                    break;
                }
                start++;
                end--;
            }

        }
        if(flag) {
            System.out.println("Palidrom");
        }
    }
}
