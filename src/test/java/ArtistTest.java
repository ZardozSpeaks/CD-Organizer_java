import org.junit.*;
import static org.junit.Assert.*;

public class ArtistTest {

  @Test
  public void newArtist_instansiatesCorrectly() {
    Artist testArtist = new Artist("testArtist");
    assertEquals(true, testArtist instanceof Artist);
  }

  @Test
  public void getArtist_returnsArtist_Woot() {
    Artist testArtist = new Artist("Woot");
    assertEquals("Woot", testArtist.getArtist());
  }
}
