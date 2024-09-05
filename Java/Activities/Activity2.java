package Activities;

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        int[] iArray = {10, 77, 10, 54, -11, 10};
          System.out.println(Arrays.toString(iArray));
        int sumValue = 30;
        int constValue = 10;
        System.out.println("Result: " + result(iArray, constValue, sumValue));
    }
    public static boolean result(int[] numbers, int constValue, int sumValue) {
       int temp = 0;
        //for (int i = 0; i < iArray.length; i++)
         for(int number:numbers){
            if (number==constValue ) {
                temp += constValue;
            }
            if (temp > sumValue) {
                break;
            }

       //     if (temp==sumValue){
        //        return;
         //   }
        }
        return temp==sumValue;
    }
}


