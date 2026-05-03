import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class StreamDemo {
    public static void main(String[] args){
        int size = 10_000;
        List<Integer> numbers = new ArrayList<>(size);
        //Generate a random number with upper bound 100
        Random random = new Random();
       for (int i=1; i<size; i++){
           numbers.add(random.nextInt(100));
       }

       int sum1 = numbers.stream()
               .map(i -> i*2)
                               .reduce(0, (c,e) -> c+e);
    long startSequential = System.currentTimeMillis();
        int sum2 = numbers.stream()
                .map(i -> {
                    try{
                       Thread.sleep(1);
                    }catch(Exception e) {
                    }
                    return i*2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSequential = System.currentTimeMillis();

        //Using parallelStream
        long startParallel = System.currentTimeMillis();
        int sum3 = numbers.parallelStream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    }catch(Exception e) {
                    }
                    return i*2;
                })
                .mapToInt(i -> i)
                .sum();
        long endParallel = System.currentTimeMillis();
       //System.out.println(numbers);

       System.out.println(sum1 + " : " + sum2 + " : " + sum3);

       System.out.println("Time taken by Sequential : " + (endSequential - startSequential));

       System.out.println("Time taken by Parallel : " + (endParallel - startParallel));
    }
}