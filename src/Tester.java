/**
 * Created by Luke on 5/22/2015.
 */
public class Tester {
    public static void main (String[] args) {
        String str = "abcd"+2;
        char[] chars = str.toCharArray();
        str = "";
        for (int i=chars.length-1; i>=0; i--) {
            str += chars[i];
        }
        System.out.println(str);
    }
}
