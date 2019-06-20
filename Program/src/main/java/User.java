public class UserVO extends ValueObject
{
  private String login;
  private String password;
  private GroupVO group;

  public UserVO(long id, String name, String login, String password, GroupVO groupID)
  {
    super(id, name);
    this.login = login;
    this.password = password;
    this.group= groupID;
  }


  public String getLogin()
  {
    return login;
  }

  public String getPassword()
  {

    return password;
  }


  @Override
  public String toString()
  {
    return super.getId() + " | " +
        super.getName() + "  \t| " +
        getLogin() + "  \t| " +
        getPassword() + " | "+
        group;

  }
}
