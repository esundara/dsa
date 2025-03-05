package others;

/**
 * License Key Formatting
 */
public class LicenseKeyFormat {

    public static void main( String argv[]) {

        String sample= "Hello-World-Out-There";
        int blockSize = 4;
        String result = licenseString(sample,4);
        System.out.println("Result = "+ result);

    }

    public static String licenseString( String input,int blockSize) {
        String clean = input.replace("-","");
        String upperClean= clean.toUpperCase();

        char[] in = upperClean.toCharArray();
        int length = in.length;
        int modulo= length%blockSize;
        System.out.println("Length = "+ length);
        System.out.println("Block Size = "+ blockSize);
        System.out.println("Modulo = "+ modulo);
        StringBuffer sbf= new StringBuffer();
        for (int i=0;i<modulo;i++){
            sbf.append(in[i]);
        }
        int noOfIterations = (length-modulo)/blockSize;
        int start= modulo;
        if(modulo != 0) {
            sbf.append("-");
        }
        for (int i=0;i<noOfIterations;i++ ){
            int from =start+blockSize*i;
            int to = start+(i+1)*blockSize;
            System.out.println("--From "+ from+ " To "+ to);
            String temp = upperClean.substring(from,to);
            System.out.println("Next string > " + temp);
            sbf.append(temp);
            if(i != noOfIterations-1){

                sbf.append("-");
            }

        }
        return sbf.toString();

    }
}
