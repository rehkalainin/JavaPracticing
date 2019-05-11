package collection.milionAdd100k;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppTestTimeAddEachElement
{
  public static void main(String[] args)
  {
    List<Integer> millionLinkedList = new LinkedList<Integer>();
    for (int i = 0; i <= 1000000; i++)
    {
      millionLinkedList.add(i);
    }
    List<Integer> millionArrayList = new ArrayList<>(1000000);
    for (int i = 0; i <= 1000000; i++)
    {
      millionArrayList.add(i);
    }

    long startTime1 = System.currentTimeMillis();
    {
      for (int i = 500000; i <= 600000; i++)
      {
        millionLinkedList.add(i, i);
      }
    }
    long finishTime1 = System.currentTimeMillis();

    long result1 = finishTime1 - startTime1;
    System.out.println("Merge Time runing LinkedList:  " + result1);


    long startTime2 = System.currentTimeMillis();
    {
      for (int i = 500000; i <= 600000; i++)
      {
        millionLinkedList.add(i, i);
      }
    }
    long finishTime2 = System.currentTimeMillis();

    long result2 = finishTime2 - startTime2;
    System.out.println("Merge Time runing ArrayList:  " + result2);

  }
}
