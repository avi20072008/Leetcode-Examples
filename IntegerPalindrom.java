public class IntegerPalindrom {

    public static void main(String[] args) {
        // Palindrom of integer numbers
        boolean flag = isNumberPalindrom(12321);
        System.out.println(" isPalindrom " + flag);
    }

    public static boolean isNumberPalindrom(int num){
        int temp = num; // 123
        int reverse = 0;

        while(temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp/10;
        }
        return reverse == num ? true : false;
    }
}
