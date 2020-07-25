import java.util.*;
public class Demo {
   public static void main(String []args){
      List<Integer> list = Arrays.asList(10, 20, 50, 100, 130, 150, 200, 250, 500);
      IntSummaryStatistics summaryStats = list.stream()
      .mapToInt((a) -> a)
      .summaryStatistics();
      System.out.println("Average of a List = "+summaryStats.getAverage());
   }
}
