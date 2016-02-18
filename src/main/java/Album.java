import java.util.ArrayList;

public class Album {

  private static ArrayList<Album> albumList = new ArrayList<Album>();

  private String mTitle;
  private int mId;

  public Album (String title) {
    mTitle = title;
    albumList.add(this);
    mId = albumList.size();
  }

  public String getTitle() {
    return mTitle;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Album> all() {
  return albumList;
 }

 public static Album find(int id) {
    try {
      return albumList.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
   albumList.clear();
  }
}
