public class Fibonachi
{
  int counter = 0;

  public long fiboRec(int i)
  {
    counter++;

    if (i == 1)
    {
      return 1;
    }
    if (i == 0)
    {
      return 0;
    }
    return fiboRec(i - 1) + fiboRec(i - 2);
  }

  public long fiboIter(int j)
  {
    long f0 = 0;
    long f1 = 1;
    long fibo = -1;

    if (j == 0)
    {
      return f0;
    }
    if (j == 1)
    {
      return f1;
    }
    
    for (int i = 2; i <= j; i++)
    {
      fibo=f0+f1;
      f0=f1;
      f1=fibo;
    }
    int counter2=j-2;

    return fibo;
  }

  public static void main(String[] args)
  {
    Fibonachi fibonachi = new Fibonachi();

    long start1 = System.currentTimeMillis();

      long fiboRec = fibonachi.fiboRec(40);

    long stop1 = System.currentTimeMillis();
    long durarion1= stop1-start1;

    long start2 = System.currentTimeMillis();

      long fiboIter = fibonachi.fiboIter(40);

    long stop2 = System.currentTimeMillis();
    long durarion2= stop2-start2;

    System.out.printf("recursive %d , %d , %d ms \n ",  fiboRec, fibonachi.counter, durarion1);
    System.out.printf("iterative %d , %d ms ",  fiboIter, durarion2);
  }
}
