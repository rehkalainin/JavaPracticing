package collection.milionAdd100k;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppTestAddLinkedVSArray
{
  public static void main(String[] args)
  {
    List<Integer> linkedList = new LinkedList<Integer>();

    long start = System.currentTimeMillis();

    {
      for (int i = 0; i <= 1_000_000; i++)
      {
        linkedList.add((int) (Math.random() * 100));
      }
    }
    long finish = System.currentTimeMillis();
    long result = finish - start;
    System.out.println("Time add LinkedList: "+ result + " ms");

    List<Integer> arrayList = new ArrayList<>(1000_000);

    long start1 = System.currentTimeMillis();

    {
      for (int i = 0; i <= 1_000_000; i++)
      {
        arrayList.add((int) (Math.random() * 100));
      }
    }
    long finish1 = System.currentTimeMillis();
    long result1 = finish1 - start1;
    System.out.println("Time add ArrayList: "+ result1 + " ms");
    double efect =(double) result/result1;
    System.out.println("Efectiv "+ efect);

  }
}
