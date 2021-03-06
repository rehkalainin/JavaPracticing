package collection.mountain;

import java.util.Comparator;

public class NameCompare implements Comparator<Mountain>
{
  @Override
  public int compare(Mountain o1, Mountain o2)
  {
    return o1.getName().compareTo(o2.getName());
  }
}
