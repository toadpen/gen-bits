package Generation;

import java.util.Arrays;
import java.util.Random;

public class Generate {

    Random random = new Random();
    
    // Generate a 1D array
    public String generate1D(int length, int range)
    {
        String strNum;
        int[] genNums = new int[length];
        for(int l = 0; l < length; l++)
        {
            int num = random.nextInt(range);
            genNums[l] = num;
        }
        strNum = Arrays.toString(genNums);
        strNum = strNum.replaceAll(",", "");
        strNum = strNum.replaceAll("\\]", "");
        strNum = strNum.replaceAll("\\[", "");
        strNum = strNum.replaceAll(" ", "");


        return strNum;
    }
    // Generate a 2D array
    public String generate2D(int length, int height, int range)
    {
        String generatedNum;
        String finalStr = "";
        for(int i = 0; i < height; i++)
        {
            generatedNum = generate1D(length, range) + "\n";
            finalStr += generatedNum;
        }
        return finalStr;
    }

}
