public class GroupVO extends ValueObject
{
  private String description;

  public GroupVO(long id, String name, String description)
  {
    super(id, name);
    this.description = description;
  }

  public GroupVO(long id)
  {
    super(id);
  }

  public String getDescription()
  {
    return description;
  }


  @Override
  public String toString()
  {
    return super.getId()+ "\t | "+
        super.getName()+ "\t | "+
        getDescription()+ "\t ";
  }
}
