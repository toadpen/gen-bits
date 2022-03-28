package Generation;

import java.util.Arrays;
import java.util.Random;

public class Generate {

    // Generate an array of numbers
    public String generateNums(int length)
    {
        Random random = new Random();
        int[] genNums = new int[length];
        for(int i = 0; i < length; i++)
        {
            int num = random.nextInt(2);
            genNums[i] = num;
        }
        String strNum = Arrays.toString(genNums);
        strNum = strNum.replaceAll(",", "");
        strNum = strNum.replaceAll("\\]", "");
        strNum = strNum.replaceAll("\\[", "");
        strNum = strNum.replaceAll(" ", "");

        return strNum;
    }

}