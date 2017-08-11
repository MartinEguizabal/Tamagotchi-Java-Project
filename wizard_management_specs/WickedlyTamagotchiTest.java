import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WickedlyTamagotchiTest{

  WickedlyTamagotchi wickedlytamagotchi1;

  @Before
  public void before(){
    wickedlytamagotchi1 = new WickedlyTamagotchi("Wyvern", 0, 0, 0, 0, false);
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
    assertEquals(0, wickedlytamagotchi1.getAge(), 0.01);
  }

  @Test
  public void canSetAge(){
    wickedlytamagotchi1.setAge(3);
    assertEquals(3, wickedlytamagotchi1.getAge(), 0.01);
  }

  @Test
  public void canGetAliveTrueFalse(){
    assertEquals(false, wickedlytamagotchi1.alive());
  }

  @Test
  public void canSetAliveTrueFalse(){
    wickedlytamagotchi1.setAlive(true);
    assertEquals(true, wickedlytamagotchi1.alive());
  }

  @Test
  public void canIsBorn(){
    wickedlytamagotchi1.isBorn(10, 4, 3);
    assertEquals(10, wickedlytamagotchi1.getHungerLevel());
    assertEquals(4, wickedlytamagotchi1.getHappinessLevel());
    assertEquals(3, wickedlytamagotchi1.getDramaLevel());
  }

  @Test
  public void canDoAging(){
    wickedlytamagotchi1.isAging(60);
    assertEquals(1.44, wickedlytamagotchi1.getAge(), 0.01);
  }
  // Tamagotchi lives about 2 human years, if fully healthy.
  // Assuming a human life is 70 years, a Tamagotchi's is 2.9% of a human life.
  // A Tamagotchi day is 41.76 minutes.
  // A Tamagotchi month is 1169.28 mintues or 19.49 hours.
  // A Tamagotchi year is 14031.36, 233.86 hours or 9.74 days.

  // @Test
  // public void canFeed(){
  //   wickedlytamagotchi1.feed(10);
  // }
}


