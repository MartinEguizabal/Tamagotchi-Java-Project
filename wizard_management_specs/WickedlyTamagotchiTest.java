import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WickedlyTamagotchiTest{

  WickedlyTamagotchi wickedlytamagotchi1;
  WickedlyTamagotchi wickedlytamagotchi2;
  WickedlyTamagotchi wickedlytamagotchi3;
  WickedlyTamagotchi wickedlytamagotchi4;
  WickedlyTamagotchi wickedlytamagotchi5;

  @Before
  public void before(){
    wickedlytamagotchi1 = new WickedlyTamagotchi("Wyvern", 0, 0, 0, 0, false, 1);
    wickedlytamagotchi2 = new WickedlyTamagotchi("Testy", 8, 4, 4, 4, true, 80);
    wickedlytamagotchi3 = new WickedlyTamagotchi("Excess", 10, 0, 10, 1, true, 90);
    wickedlytamagotchi4 = new WickedlyTamagotchi("Skinny", 10, 0, 10, 1, true, 9);
    wickedlytamagotchi5 = new WickedlyTamagotchi("BigN", 10, 0, 10, 1, true, 96);
  }
  // name, hunger_level, happiness_level, drama_level, age, alive, weight

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
  public void cantSetHappinessBeyond10(){
    wickedlytamagotchi1.setHappinessLevel(11);
    assertEquals(10, wickedlytamagotchi1.getHappinessLevel());
  }

  @Test
  public void cantSetHappinessBellow0(){
    wickedlytamagotchi1.setHappinessLevel(-1);
    assertEquals(0, wickedlytamagotchi1.getHappinessLevel());
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
    assertEquals(false, wickedlytamagotchi1.getAliveTrueFalse());
  }

  @Test
  public void canSetAliveTrueFalse(){
    wickedlytamagotchi1.setAliveTrueFalse(true);
    assertEquals(true, wickedlytamagotchi1.getAliveTrueFalse());
  }

  @Test
  public void canGetWeight(){
    assertEquals(1, wickedlytamagotchi1.getWeight());
  }

  @Test
  public void canSetWeight(){
    wickedlytamagotchi1.setWeight(10);
    assertEquals(10, wickedlytamagotchi1.getWeight());
  }

  @Test
  public void canIsBorn(){
    wickedlytamagotchi1.isBorn();
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

  @Test
  public void canFeed(){
    assertEquals("Yummy", wickedlytamagotchi1.feed("protein shake"));
    assertEquals(0, wickedlytamagotchi1.getHungerLevel());
    assertEquals(1, wickedlytamagotchi1.getHappinessLevel());
  }

  @Test
  public void canFeed__Two(){
    assertEquals("Yummy", wickedlytamagotchi2.feed("marmelade haggis"));
    assertEquals(3, wickedlytamagotchi2.getHungerLevel());
    assertEquals(7, wickedlytamagotchi2.getHappinessLevel());
    assertEquals(2, wickedlytamagotchi2.getDramaLevel());
  }

  @Test
  public void canFeedDontButLikeFood(){
    assertEquals("Yeachtk, I don't eat dat!", wickedlytamagotchi1.feed("spinach"));
    assertEquals(10, wickedlytamagotchi5.getHungerLevel());
  }

  @Test
  public void canSleep(){
    wickedlytamagotchi2.sleep();
    assertEquals(9, wickedlytamagotchi2.getHungerLevel());
    assertEquals(5, wickedlytamagotchi2.getHappinessLevel());
    assertEquals(3, wickedlytamagotchi2.getDramaLevel());
  }

  @Test
  public void canGetsOverweight(){
    wickedlytamagotchi2.getsOverweight();
    assertEquals(1, wickedlytamagotchi2.getHappinessLevel());
    assertEquals(8, wickedlytamagotchi2.getDramaLevel());
  }

  @Test
  public void canGetsOverweightExcess(){
    wickedlytamagotchi3.getsOverweight();
    assertEquals(0, wickedlytamagotchi3.getHappinessLevel());
    assertEquals(10, wickedlytamagotchi3.getDramaLevel());
  }

  @Test
  public void canStarve(){
    wickedlytamagotchi4.starves(600);
    assertEquals(false, wickedlytamagotchi4.getAliveTrueFalse());
  }

  @Test
  public void getsDepressed(){
    wickedlytamagotchi1.depressed(7500);
    assertEquals(false, wickedlytamagotchi1.getAliveTrueFalse());
  }

  @Test
  public void getsHeartAttack(){
    wickedlytamagotchi4.heartAttack(300);
    assertEquals(false, wickedlytamagotchi4.getAliveTrueFalse());
  }

  @Test
  public void getsMorbidlyObese(){
    wickedlytamagotchi5.morbidlyObese(1200);
    assertEquals(false, wickedlytamagotchi5.getAliveTrueFalse());
  }
}


