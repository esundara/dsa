package others;

public class ReverseString {

    public static void main (String argv[]){
        String testString = "Hello";
        System.out.println(testString);
        char[] chars = testString.toCharArray();

        String result1 = reverseWithNewArray(chars);
        System.out.println("Result 1 > "+ result1);

        String result2 = revereSameArray(chars);
        System.out.println("Result 2 > "+ result2);

    }

    public static String reverseWithNewArray(char[] input) {
        int len = input.length;
        char[] result = new char[len];
        int position = 0;
        for(int i=len-1;i>=0;i--) {
            result[i]= input[position];
            position ++;
        }
        return String.valueOf(result);
    }

    public static String revereSameArray(char[] input) {
        int left = 0;
        int right = input.length-1;
        while (left < right){
            char temp= input[left];
            input[left] =  input[right];
            input[right]= temp;
            left++;
            right --;
        }
        return String.valueOf(input);
    }
}
