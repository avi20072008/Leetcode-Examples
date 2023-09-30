import java.util.ArrayList;
import java.util.List;

public class Patterns {

    public static void main(String[] args) {
        pattern1();

        pattern2();

        pattern3();
    }

    /* print
          1 1 1 1
          2 2 2 2
          3 3 3 3
          4 4 4 4
  */
    private static void pattern1() {
        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j < 5 ; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
    /*
             * * * *
             *     *
             *     *
             * * * *
     */
    private static void pattern2() {
        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j < 5 ; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("* ");
                }else{
                    if (j == 2 || j == 3)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    // Pascal Triangle
    /*
                1
              1     1
            1    2    1
           1   3   3    1
          1   4   6   4   1

     */
    private static void pattern3() {
        List<Integer> prev = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        int sum = 0;
        prev.add(1);
        //row.add(1,1);
        List<List<Integer>> tr = new ArrayList<>();
        System.out.println(prev.get(0) + " ");

        for (int i = 0; i < 5 ; i++) {
            row.add(1);
            for (int j = 0; j < prev.size() -1  ; j++) {
                sum = prev.get(j) + prev.get(j+1);
                row.add(sum);
            }

            row.add(1);
            tr.add(row);
            for (int item: row) {
                System.out.print(item + " ");
            }
            System.out.println(" ");

            prev = new ArrayList<>(row);
            row.clear();
        }

    }
}
