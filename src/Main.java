import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.isPalindrome(151);
    }

    public boolean isPalindrome(int x) {

        String stringX = String.valueOf(x);
        char[] forwardArray = stringX.toCharArray();
        char[] backwardsArray = new char[forwardArray.length];

        int i;
        for(i=forwardArray.length; i>0; i--) {
            backwardsArray[forwardArray.length - i] = forwardArray[i-1];
        }

        return Arrays.equals(forwardArray, backwardsArray);
    }
}
