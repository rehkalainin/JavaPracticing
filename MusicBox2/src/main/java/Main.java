import java.io.IOException;

public class Main
{
  public static void main(String[] args)
  {
    MusicMashin musicMashin = new MusicMashin();
    try
    {
      musicMashin.go();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
