
import java.time.*;

public class RangeTime
{
  LocalDateTime timePoint = LocalDateTime.now();

  public void today()
  {
    LocalDate date = timePoint.toLocalDate();
    System.out.println("Today : "+ date);

  }

  public void yesterday()
  {
    LocalDate date = timePoint.minusDays(1).toLocalDate();
    System.out.println("Yesterday : "+date);
  }

  public void thisWeek()
  {
    DayOfWeek dayOfWeek = timePoint.getDayOfWeek();
    int numberDay = dayOfWeek.getValue();
    LocalDate firstDay = timePoint.minusDays(numberDay-1).toLocalDate(); // -1 to count from Monday
    LocalDate toDay = timePoint.toLocalDate();

    System.out.println("this Week : "+firstDay+" | "+toDay);
  }

  public void previousWeek()
  {
    DayOfWeek dayOfWeek = timePoint.getDayOfWeek();
    int numberDay = dayOfWeek.getValue();
    LocalDate firstDay = timePoint.minusDays(numberDay-1).minusWeeks(1).toLocalDate(); // -8 count from last Monday
    LocalDate lastDay = firstDay.plusDays(6);

    System.out.println("previous Week : "+firstDay+" | "+lastDay);
  }

  public void thisMonth()
  {
    LocalDate firstDay =timePoint.withDayOfMonth(1).toLocalDate();
    LocalDate toDay = timePoint.toLocalDate();
    System.out.println("thisMonth : "+firstDay+" | "+toDay);
  }

  public void previousMonth()
  {
    LocalDate firstDay = timePoint.minusMonths(1).withDayOfMonth(1).toLocalDate();
    LocalDate lastDay = firstDay.plusMonths(1).minusDays(1);
    System.out.println("lastMonth : "+firstDay+" | "+ lastDay);
  }


}
