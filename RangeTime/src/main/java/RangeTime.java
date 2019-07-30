
import java.time.*;

public class RangeTime
{
  public static LocalDateTime timePoint = LocalDateTime.now();

  public static LocalDate today()
  {
    LocalDate date = timePoint.toLocalDate();
    return date;
  }

  public static LocalDate yesterday()
  {
    LocalDate date = timePoint.minusDays(1).toLocalDate();
    return date;
  }

  public static PeriodDays thisWeek()
  {
    DayOfWeek dayOfWeek = timePoint.getDayOfWeek();
    int numberDay = dayOfWeek.getValue();
    LocalDate first = timePoint.minusDays(numberDay - 1).toLocalDate(); // -1 to count from Monday
    LocalDate last = timePoint.toLocalDate();

    return new PeriodDays(first, last);
  }

  public static PeriodDays previousWeek()
  {
    DayOfWeek dayOfWeek = timePoint.getDayOfWeek();
    int numberDay = dayOfWeek.getValue();
    LocalDate firstDay = timePoint.minusDays(numberDay - 1).minusWeeks(1).toLocalDate();
    LocalDate lastDay = firstDay.plusDays(6);

    return new PeriodDays(firstDay,lastDay);
  }

  public static PeriodDays thisMonth()
  {
    LocalDate firstDay = timePoint.withDayOfMonth(1).toLocalDate();
    LocalDate toDay = timePoint.toLocalDate();
    return new PeriodDays(firstDay,toDay);
  }

  public static PeriodDays previousMonth()
  {
    LocalDate firstDay = timePoint.minusMonths(1).withDayOfMonth(1).toLocalDate();
    LocalDate lastDay = firstDay.plusMonths(1).minusDays(1);
    return new PeriodDays(firstDay,lastDay);
  }


}
