import java.util.*;

public class AppTestAddLinkedVSArrayVsHashMap
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
    System.out.println("Time add in LinkedList: " + result + " ms");

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
    System.out.println("Time add in ArrayList: " + result1 + " ms");
    double efect = (double) result / result1;
    System.out.println("Efectiv " + efect);

    Map<Integer, Integer> hashMap = new HashMap<>(1_000_000);

    long start2 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 1_000_000; i++)
      {
        hashMap.put(null, (int) (Math.random() * 100));
      }
    }
    long finish2 = System.currentTimeMillis();
    long result2 = finish2 - start2;
    System.out.println(" Time add in HashMap " + result2 + " ms");

    Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>(1000000);

    long start3 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 1_000_000; i++)
      {
        linkedHashMap.put(null, (int) (Math.random() * 100));
      }
    }
    long finish3 = System.currentTimeMillis();
    long result3 = finish3 - start3;
    System.out.println(" Time add in LinkedHashMap " + result3 + " ms");

    Set<Integer> set = new HashSet<>(1000000);

    long start4 = System.currentTimeMillis();
    {
      for (int i = 0; i <= 1_000_000; i++)
      {
        set.add((int) (Math.random() * 100));
      }
    }
    long finish4 = System.currentTimeMillis();

    long result4 = finish4 - start4;
    System.out.println(" Time add in HashSet " + result4 + " ms");
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    for (int i = 0; i < 10; i++)
    {
      System.out.print(arrayList.get(i) + " ,");
    }
    System.out.println(" ");
    for (int i = 5; i < 10; i++)
    {
      System.out.print(arrayList.remove(i) + " ,");
    }
    System.out.println(" ");

    for (int i = 0; i < 10; i++)
    {
      System.out.print(arrayList.get(i) + " ,");
    }

    ListIterator listIterator = arrayList.listIterator();

    for (int i = 5; i < 10; i++)
    {
      listIterator.remove();
    }

    for (int i = 0; i <= 10; i++)
    {
      System.out.println(arrayList.get(i));
    }
  }

}

