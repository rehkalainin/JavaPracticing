package collection.mountain;

import java.util.Comparator;

public class HeightCompare implements Comparator<Mountain>
{
  @Override
  public int compare(Mountain o1, Mountain o2)
  {
    return o1.getHeight().compareTo(o2.getHeight());
  }
}
