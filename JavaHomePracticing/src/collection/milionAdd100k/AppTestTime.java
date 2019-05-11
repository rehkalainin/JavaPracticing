package collection.milionAdd100k;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppTestTime
{

  public static void main(String[] args)
  {
    List<Integer> millionLinkedList = new LinkedList<Integer>();
    for (int i = 0; i < 1000001; i++)
    {
      millionLinkedList.add(i);
    }
    List<Integer> millionArrayList = new ArrayList<>(1100001);
    for (int i = 0; i < 1000001; i++)
    {
      millionArrayList.add(i);
    }

    List<Integer> oneHundredThousandLinkedList = new LinkedList<>();
    for (int i = 0; i < 100000; i++)
    {
      oneHundredThousandLinkedList.add(i);
    }

    List<Integer> oneHundredThousandArrayList = new ArrayList<>(100001);
    for (int i = 0; i < 100000; i++)
    {
      oneHundredThousandArrayList.add(i);
    }

    long startTime1 = System.currentTimeMillis();
    {millionLinkedList.addAll(500000,oneHundredThousandLinkedList);}
    long finishTime1 = System.currentTimeMillis();

    long result1 = finishTime1-startTime1;
    System.out.println("Merge Time runing LinkedList:  "+ result1);


    long startTime2 = System.currentTimeMillis();
    {millionArrayList.addAll(500000, oneHundredThousandArrayList);}
    long finishTime2 = System.currentTimeMillis();

    long result2 = finishTime2-startTime2;
    System.out.println("Merge Time runing ArrayList:  "+ result2);


  }
}
