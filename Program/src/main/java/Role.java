public class RoleVO extends ValueObject
{
  private String description;

  public RoleVO(long id, String name, String description)
  {
    super(id, name);
    this.description = description;
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
        getDescription()+ "\t | ";
  }
}
