package collection.mountain;

public class Mountain
{
  private String name;
  private Integer height;

  public Mountain(String name, Integer height)
  {
    this.name = name;
    this.height = height;
  }

  public String getName()
  {
    return name;
  }

  public Integer getHeight()
  {
    return height;
  }

  @Override
  public String toString()
  {
    return "{" +
         name + "/ " +
         height + "/ "+
        '}';
  }
}
