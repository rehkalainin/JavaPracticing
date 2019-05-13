package recursiya;

public class Factorial
{
  public int factorialIter (int j)
  {
    int res = 1;
    while (j > 1)
    {
      res = res * j;
      j--;
    }
    return res;
  }

  public int factorialRecurs(int i)
  {
    if (i <= 1)
    {
      return 1;
    }
    else
    {
      return i * factorialRecurs(i - 1);
    }


  }

  public static void main(String[] args)
  {
    Factorial f = new Factorial();
    System.out.println("Factorial recurs : " + f.factorialRecurs(1));
    System.out.println("Factorial iter : " + f.factorialIter(1));
  }
}
