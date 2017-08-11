import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WickedlyTamagotchiTest{

  WickedlyTamagotchi wickedlytamagotchi;

  @Before
  public void before(){
    wickedlytamagotchi = new WickedlyTamagotchi("Wyvern", 0, 0, 0, 0);
  }

  @Test
  public void canGetDramaLevel(){
    assertEquals(0, wickedlytamagotchi.getDramaLevel());
  }

  @Test
  public void canGetAge(){
    assertEquals(0, wickedlytamagotchi.getAge());
  }
}