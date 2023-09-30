import java.util.Arrays;

// Author : Avinash Patil

public class DuplicateNumber {
    public static void main(String[] args) {

        boolean isDuplicate = findDuplicateInArray();

        System.out.println("Is there any duplicate : " + isDuplicate);
    }

    private static boolean findDuplicateInArray() {
        int[] nums = {1, 3, 4, 11, 3, 14, 21};

        Arrays.sort(nums);

        for (int i = 0; i < nums.length -1 ; i++) {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
