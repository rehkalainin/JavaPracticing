package collection.musicBox2;

import java.util.Comparator;

public class TitleComparator implements Comparator<Song>
{
  @Override
  public int compare(Song o1, Song o2)
  {
    return o1.getTitle().compareTo(o2.getTitle());
  }
}
