package collection.musicBox;

import java.io.*;
import java.util.*;

public class MusicBox
{
  List<Song> songList = new ArrayList<>();
  Set<Song> sortedSet = new TreeSet<>();

  public void go()
  {
    getSongs();

    System.out.println("Unsorted ~~~~~~~~~~~~~~~~~~~");
    System.out.println(songList);

    Collections.sort(songList);
    System.out.println("Artist sorted by Comparable - comparableTo ~~~~~~~~~~~~~~~~~~~");
    System.out.println(songList);

    System.out.println("Sorted Set ~~~~~~~~~~~~~~~~~~~");
    System.out.println(sortedSet);
  }

  private void getSongs()
  {
    try
    {
      File file = new File("D:\\Костя\\Java\\JavaHomePracticing\\src\\SongList");
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line = null;
      while ((line = reader.readLine()) != null)
      {
        addSong(line);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      }
  }

  private void addSong(String lineToParse)
  {
    String[] token = lineToParse.split("/");
    Song song = new Song(token[0], token[1], token[2], token[3]);
    songList.add(song);
    sortedSet.add(song);
  }
}