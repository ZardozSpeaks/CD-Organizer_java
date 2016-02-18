import java.util.ArrayList;

public class Artist {

  private static ArrayList<Artist> artistList = new ArrayList<Artist>();

  private String mArtist;
  private int mId;

  public Artist(String artist) {
    mArtist = artist;
    artistList.add(this);
    mId = artistList.size();
  }

  public String getArtist() {
    return mArtist;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Artist> all() {
  return artistList;
 }

 public static Artist find(int id) {
    try {
      return artistList.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
   artistList.clear();
  }

}
