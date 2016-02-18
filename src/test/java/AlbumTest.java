import org.junit.*;
import static org.junit.Assert.*;

public class AlbumTest {

  @Test
  public void newAlbum_instansiatesCorrectly() {
    Album testalbum = new Album("testTitle");
    assertEquals(true, testalbum instanceof Album);
  }

  @Test
  public void getTitle_returnsTitle_Woot() {
    Album testAlbum = new Album("Woot");
    assertEquals("Woot", testAlbum.getTitle());
  }
}
