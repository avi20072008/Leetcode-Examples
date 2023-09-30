// Author : Avinash Patil

public class FrequencyOfNumber {
    public static void main(String[] args) {
        findFrequency();
    }
    private static void findFrequency() {
        int[] arr = {5,5,7,10,10,21}; //{10,20,20,30,30,30,40};
        int index = 0;
        int freq = 1;

        while(index < arr.length){
            if(index < arr.length-1 && arr[index] == arr[index + 1]){
                freq++;
            } else {
                System.out.println(arr[index] + " --> " + freq);
                freq = 1;   //reset frequency
            }
            index++;
        }
    }
}
