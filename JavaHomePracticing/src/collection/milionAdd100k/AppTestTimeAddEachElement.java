package collection.milionAdd100k;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppTestTimeAddEachElement
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
    System.out.println("Time LinkedList:  " + result1+ " ms");


    long startTime2 = System.currentTimeMillis();
    {
      for (int i =0; i <= 100_000; i++)
      {
        arrayList.add(arrayList.size()/2, i);
      }
    }
    long finishTime2 = System.currentTimeMillis();

    long result2 = finishTime2 - startTime2;
    System.out.println("Time runing ArrayList:  " + result2+ " ms");

    double efect =(double) result1/result2;
    System.out.println("Efectiv "+ efect);

  }
}
