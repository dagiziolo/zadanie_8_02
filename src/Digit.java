public class Digit {

    public static int sumDigits(int number){
        int[] digit = splitNumber(number);
        int sum = 0;
        for (int i = 0; i < digit.length; i++) {
            sum+=digit[i];
        }
        return sum;
    }

    static int[] splitNumber(int number) {
        int[] digit = new int[countDigits(number)];
        for (int i = digit.length - 1; i >=0 ; i--) {
            digit[i] = number%10;
            number=number/10;
        }
        return digit;
    }

    static int countDigits(int number) {
        int count = 0;
        while (number>0){
            number=number/10;
            count++;
        }
        return count;
    }


}
