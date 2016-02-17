import org.junit.*;
import static org.junit.Assert.*;

public class CdTest {

  @Test
  public void newCd_instansiatesCorrectly() {
    Cd testCd = new Cd("testTitle");
    assertEquals(true, testCd instanceof Cd);
  }

  @Test
  public void getTitle_returnsTitle_Woot() {
    Cd testCd = new Cd("Woot");
    assertEquals("Woot", testCd.getTitle());
  }

  @Test
  public void getArtist_returnsArtist_SomeGuy() {
    Artist testArtist = new Artist("SomeGuy");
    assertEquals("SomeGuy", testArtist.getArtist());
  }

}
