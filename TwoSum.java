import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum();
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    private static int[] twoSum() {
        int target = 20;
        int num[] = {3, 2, 7, 10, 18};

        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < num.length ; i++) {
            int complement = target - num[i];

            if(numsMap.containsKey(num[i])){
                return new int[] {i, numsMap.get(num[i])};
            }

            numsMap.put(complement, i);
        }
        throw new IllegalArgumentException("No Solution Found");
    }
}
