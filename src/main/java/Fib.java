import java.util.ArrayList;
import java.util.Arrays;


public class Fib {
   ArrayList<Integer> fibbonaciList;
   int currentIndex = 0;

   public Fib() {
      fibbonaciList = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13));
   }

   public void printNextFibonacci() {
      if (currentIndex < fibbonaciList.size()) {
         System.out.println(fibbonaciList.get(currentIndex));
         currentIndex++;
      } else {
         System.out.println("Ende der Fibonacci-Liste erreicht.");
      }
   }


}

