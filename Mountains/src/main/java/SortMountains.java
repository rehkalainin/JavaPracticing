import java.util.Collections;
import java.util.LinkedList;

public class SortMountains
{
  LinkedList<Mountain> mtn = new LinkedList<Mountain>();

  public static void main(String[] args)
  {
    new SortMountains().go();

  }

  private void go()
  {
    mtn.add(new Mountain("Long Raige", 14255));
    mtn.add(new Mountain("Elbert", 14433));
    mtn.add(new Mountain("Marun", 14156));
    mtn.add(new Mountain("Kasl", 14265));

    System.out.println("Unsorted list ~~~~~~~~~~~~~~~~~~~");
    System.out.println(mtn);

    System.out.println("Sorted by name ~~~~~~~~~~~~~~~~~~~");
    NameCompare nameCompare = new NameCompare();
    Collections.sort(mtn,nameCompare );
    System.out.println(mtn);

    System.out.println("Sorted by height ~~~~~~~~~~~~~~~~~~~");
    HeightCompare heightCompare=new HeightCompare();
    Collections.sort(mtn, heightCompare );
    System.out.println(mtn);


  }
}
