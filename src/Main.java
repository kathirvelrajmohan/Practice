import java.util.ArrayList;
import java.util.List;
//Main
public class Main {
    public static void main(String[] args) {
        System.out.println(canPalindrome("dmmaa"));
    }
    static boolean canPalindrome(String str){
        List<Character> l = new ArrayList<Character>();
        for(int i = 0;i<str.length();i++) {
            if (l.contains(str.charAt(i))) {
                l.remove((Character) str.charAt(i));
            } else {
                l.add(str.charAt(i));
            }
        }
        return l.isEmpty() && str.length() % 2 == 0 || l.size() == 1 && str.length()%2 == 1;
    }
}