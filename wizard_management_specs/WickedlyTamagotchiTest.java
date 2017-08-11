import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WickedlyTamagotchiTest{

  WickedlyTamagotchi wickedlytamagotchi1;

  @Before
  public void before(){
    wickedlytamagotchi1 = new WickedlyTamagotchi("Wyvern", 0, 0, 0, 0);
  }

  @Test
  public void canGetName(){
    assertEquals("Wyvern", wickedlytamagotchi1.getName());
  }

  @Test
  public void canSetName(){
    wickedlytamagotchi1.setName("TestTamagotchi");
    assertEquals("TestTamagotchi", wickedlytamagotchi1.getName());
  }

  @Test
  public void canGetHappinessLevel(){
    assertEquals(0, wickedlytamagotchi1.getHappinessLevel());
  }

  @Test
  public void canSetHappinessLevel(){
    wickedlytamagotchi1.setHappinessLevel(2);
    assertEquals(2, wickedlytamagotchi1.getHappinessLevel());
  }

  @Test
  public void canGetDramaLevel(){
    assertEquals(0, wickedlytamagotchi1.getDramaLevel());
  }

  @Test
  public void canSetDramaLevel(){
    wickedlytamagotchi1.setDramaLevel(5);
    assertEquals(5, wickedlytamagotchi1.getDramaLevel());
  }

  @Test
  public void canGetAge(){
    assertEquals(0, wickedlytamagotchi1.getAge());
  }

  @Test
  public void canSetAge(){
    wickedlytamagotchi1.setAge(3);
    assertEquals(3, wickedlytamagotchi1.getAge());
  }

  @Test
  public void canIsBorn(){
    wickedlytamagotchi1.isBorn(10, 4, 3);
    assertEquals(10, wickedlytamagotchi1.getHungerLevel());
    assertEquals(4, wickedlytamagotchi1.getHappinessLevel());
    assertEquals(3, wickedlytamagotchi1.getDramaLevel());
  }
}