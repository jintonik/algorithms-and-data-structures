package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class H {
    public static String sumOfBinaries(String a, String b) {
        var maxDigitsNumber = a.length() >= b.length() ? a : b;
        //"1010"
        //"1011"
        StringBuilder result = new StringBuilder();

        char[] aChars = a.toCharArray();    //       [1, 1, 0, 0]     [1, 0, 1]
        char[] bChars = b.toCharArray();   //  [1, 0, 1, 1, 1, 1]     [ ,  , 1]
                                          //   [1, 1, 1, 0, 1, 1]     [1, 1, 0]

        var bufferNumber = "";

        for (int i = 0; i < maxDigitsNumber.length(); i++) {

            var aMax = a.length() - i;
            var bMax = b.length() - i;

            var aPart = ' ';
            var bPart = ' ';

            if (aMax <= 0) {
                aPart = '0';
            } else {
                aPart = aChars[a.length() - i - 1];
            }
            if (bMax <= 0) {
                bPart = '0';
            } else {
                bPart = bChars[b.length() - i - 1];
            }
            if (aPart == '1' && bPart == '0') {
                if (bufferNumber.equals("1")) {
                    result.append("0");
                } else {
                    result.append("1");
                }
                continue;
            }
            if (aPart == '0' && bPart == '1') {
                if (bufferNumber.equals("1")) {
                    result.append("0");
                } else {
                    result.append("1");
                }
                continue;
            }
            if (aPart == '1' && bPart == '1') {
                if (bufferNumber.equals("1")) {
                    result.append("1");
                } else {
                    result.append("0");
                }
                bufferNumber = "1";
                continue;
            }
            if ((aPart == '0' && bPart == '0')) {
                if (bufferNumber.equals("1")) {
                    result.append("1");
                    bufferNumber = "";
                } else {
                    result.append("0");
                }
            }
        }
        result.append(bufferNumber);
        return result.reverse().toString();
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String a = reader.readLine();
            String b = reader.readLine();
            System.out.println(sumOfBinaries(a, b));
        }
    }
}