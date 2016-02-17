import java.util.ArrayList;


public class Artist {

private static ArrayList<Artist> instances = new ArrayList<Artist>();

private String mArtist;
private int mId;

  public Artist(String artist) {
    mArtist = artist;
    instances.add(this);
    mId = instances.size();
  }

  public String getArtist() {
    return mArtist;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Artist> all() {
  return instances;
 }

 public static Artist find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
   instances.clear();
  }

}
