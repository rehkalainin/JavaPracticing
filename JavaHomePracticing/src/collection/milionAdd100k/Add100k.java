package collection.milionAdd100k;

import java.util.*;

public class Add100k
{
  public static void main(String[] args)
  {
    List<Integer> linkedList = new LinkedList<Integer>();
    for (int i = 0; i <= 1_000_000; i++)
    {
      linkedList.add(i);
    }

    List<Integer> arrayList = new ArrayList<>(1000_000);
    for (int i = 0; i <= 1_000_000; i++)
    {
      arrayList.add(i);
    }

    long startTime1 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 100_000; i++)
      {
        linkedList.add(linkedList.size()/2, i);
      }
    }
    long finishTime1 = System.currentTimeMillis();

    long result1 = finishTime1 - startTime1;
    System.out.println("Time add 100k in 1M LinkedList:  " + result1+ " ms");


    long startTime2 = System.currentTimeMillis();
    {
      for (int i =0; i <= 100_000; i++)
      {
        arrayList.add(arrayList.size()/2, i);
      }
    }
    long finishTime2 = System.currentTimeMillis();

    long result2 = finishTime2 - startTime2;
    System.out.println("Time add 100k in 1M ArrayList:  " + result2+ " ms");

    double efect =(double) result1/result2;
    System.out.println("Efectiv "+ efect);

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Map<Integer, Integer> hashMap = new HashMap<>(1_000_000);
    for (int i = 0; i <= 1_000_000; i++)
    {
      hashMap.put(null, (int) (Math.random() * 100));
    }

    long start3 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 100_000; i++)
      {
        hashMap.put(null,(int) (Math.random()*100));
      }
    }
    long finish3 = System.currentTimeMillis();
    long result3 = finish3 - start3;
    System.out.println(" Time add 100k in 1M HashMap " + result3 + " ms");
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>(1_000_000);
    for (int i = 0; i <= 1_000_000; i++)
    {
      linkedHashMap.put(null, (int) (Math.random() * 100));
    }

    long start4 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 100_000; i++)
      {
        linkedHashMap.put(null,(int) (Math.random()*100));
      }
    }
    long finish4 = System.currentTimeMillis();
    long result4 = finish4 - start4;
    System.out.println(" Time add 100k in 1M LinkedHashMap " + result4 + " ms");
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Set<Integer> hashSet = new HashSet<>(1_000_000);
    for (int i = 0; i <= 1_000_000; i++)
    {
      hashSet.add((int) (Math.random() * 100));
    }

    long start5 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 100_000; i++)
      {
        hashSet.add((int) (Math.random()*100));
      }
    }
    long finish5 = System.currentTimeMillis();
    long result5 = finish5 - start5;
    System.out.println(" Time add 100k in 1M HashSet " + result5 + " ms");
  }
}
