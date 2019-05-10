package collection.musicBox2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusikMashin
{
  List<Song> songList = new ArrayList<>();

  public void go() throws IOException
  {
    getSongs();

    System.out.println("Unsorted list ~~~~~~~~~~~~~");
    System.out.println(songList);

    System.out.println("Title sorted list ~~~~~~~~~~~~~");

    TitleComparator titleComparator= new TitleComparator();
    Collections.sort(songList, titleComparator);
    System.out.println(songList);

    System.out.println("Artist sorted list ~~~~~~~~~~~~~");

    ArtistComparator artistComparator= new ArtistComparator();
    Collections.sort(songList, artistComparator);
    System.out.println(songList);

  }

  private void getSongs() throws IOException
  {
    File file = new File("D:\\Костя\\Java\\JavaHomePracticing\\src\\SongList");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line = null;
    while ((line = reader.readLine())!=null)
    {
      addSong(line);
    }
  }

  private void addSong(String line)
  {
    String[] token = line.split("/");
    Song song = new Song(token[0], token[1], token[2], token[3]);
    songList.add(song);
  }
}
