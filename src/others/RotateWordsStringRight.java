package others;

import java.util.Arrays;

/**
 * Rotate each character once in each word in the string to right
 * Example
 * Input = Quick Brown Fox Jumped Over Lazy Dog
 * Result= kQuic nBrow xFo dJumpe rOve eTh yLaz gDo
 */
public class RotateWordsStringRight {

    public static void main(String argv[]){

        String input = "Quick Brown Fox Jumped Over Lazy Dog";
        rotateWordsInAString();

    }

    public static String rotateWordsInAString() {
        System.out.println("rotateWordsInAString");
        String s = "Quick Brown Fox Jumped Over The Lazy Dog";
        String[] splitwords = s.split(" ");
        System.out.println( Arrays.toString(splitwords) );
        StringBuffer sb = new StringBuffer();

        for(int i = 0;i <splitwords.length;i++) {
            String x = splitwords[i];
            char[] charArr = x.toCharArray();
            int len = charArr.length;

            char lastElement = charArr[charArr.length - 1];
            for(int j = len -1 ;j > 0 ;j--) {
                charArr[j] = charArr[j-1] ;
                System.out.println( charArr[j]);

            }
            charArr[0] = lastElement;
            sb.append(charArr);
            sb.append(" ");
            System.out.println( Arrays.toString(charArr) );

        }
        System.out.println(" Result : " + sb.toString());
        return sb.toString();

    }
}
