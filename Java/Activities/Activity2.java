package activities;

public class Activity2 {
    public static void main(String[] args){
        int[] numArr = {10, 77, 10, 54, -11, 10};
        int searchNum = 10;
        int fixedSum = 30;
        System.out.println("Result is "+result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedNum){
        int temp = 0;
        for(int number: numbers){
            if(number == searchNum){
                temp = temp+searchNum;
            }

            if(temp>fixedNum){
                break;
            }
        }
        return temp==fixedNum;
    }
}
