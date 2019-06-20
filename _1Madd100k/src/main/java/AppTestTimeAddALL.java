import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppTestTimeAddALL
{

  public static void main(String[] args)
  {
    List<Integer> millionLinkedList = new LinkedList<Integer>();
    for (int i = 0; i < 1000001; i++)
    {
      millionLinkedList.add(i);
    }
    List<Integer> millionArrayList = new ArrayList<>(1000_000);
    for (int i = 0; i < 1000001; i++)
    {
      millionArrayList.add(i);
    }

    List<Integer> oneHundredThousandLinkedList = new LinkedList<>();
    for (int i = 0; i < 100000; i++)
    {
      oneHundredThousandLinkedList.add(i);
    }

    List<Integer> oneHundredThousandArrayList = new ArrayList<>(100_000);
    for (int i = 0; i < 100000; i++)
    {
      oneHundredThousandArrayList.add(i);
    }

    long startTime1 = System.currentTimeMillis();
    {millionLinkedList.addAll(millionLinkedList.size()/2,oneHundredThousandLinkedList);}
    long finishTime1 = System.currentTimeMillis();

    long result1 = finishTime1-startTime1;
    System.out.println("Merge Time runing LinkedList:  "+ result1);


    long startTime2 = System.currentTimeMillis();
    {millionArrayList.addAll(millionArrayList.size()/2, oneHundredThousandArrayList);}
    long finishTime2 = System.currentTimeMillis();

    long result2 = finishTime2-startTime2;
    System.out.println("Merge Time runing ArrayList:  "+ result2);

    double efect =(double) result1/result2;
    System.out.println("Efectiv "+ efect);


  }
}
