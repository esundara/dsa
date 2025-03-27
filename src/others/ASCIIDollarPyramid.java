package others;

/**
 * Building an ASCII Pyramid With Dollars based on input number of rows
 * So for example if number of rows = 5, then print
 *          $
 *         $$$
 *        $$$$$
 *       $$$$$$$
 *      $$$$$$$$$
 */
public class ASCIIDollarPyramid {

    public static void main(String[] args) {
        generate(5);
    }

    public static void generate(int numberOfRows) {
        int position = numberOfRows - 1;
        int stars = 1;
        for (int i = 0; i < numberOfRows; i++) {
            String spaces = " ".repeat(position);
            if (position > 0) {
                position--;
            }

            StringBuilder str = new StringBuilder();
            for (int j = 0; j < stars; j++) {
                str.append("$");
            }
            stars = stars + 2;
            System.out.println(spaces + str);

        }

    }


}
