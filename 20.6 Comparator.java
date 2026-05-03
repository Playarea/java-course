import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 20.6 Comparator.java {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
       //Custom sort by the last digits
        List<Integer> num = new ArrayList<>();
        nums.add(23);
        nums.add(13);
        nums.add(72);
        nums.add(59);

        Collections.sort(num, comparator);
        System.out.printlin(num);



    }
}