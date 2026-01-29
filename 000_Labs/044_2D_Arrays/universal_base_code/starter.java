/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        int[][] nums = {
            {2, 4, 6},
            {8, 10, 12}
        };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum = sum + nums[i][j];
                count = count + 1;
            }
        }
        double average = sum / count;
       
    }
}
