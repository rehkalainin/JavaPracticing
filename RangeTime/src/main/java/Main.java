import java.sql.SQLOutput;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(RangeTime.today());
    System.out.println(RangeTime.yesterday());
    System.out.println("this week : "+ RangeTime.thisWeek());
    System.out.println(RangeTime.previousWeek());
    System.out.println(RangeTime.thisMonth());
    System.out.println(RangeTime.previousMonth());

  }
}
