import java.time.LocalDate;

public class PeriodDays
{
  public LocalDate first;
  public LocalDate last;

  public PeriodDays(LocalDate first, LocalDate last)
  {
    this.first = first;
    this.last = last;
  }

  @Override
  public String toString()
  {
    return "PeriodDays{"+first +" | "+ last +
        '}';
  }
}
