import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class HouseTest{

  House house1;
  House house2;
  House house3;
  WickedlyTamagotchi wickedlytamagotchi1;
  WickedlyTamagotchi wickedlytamagotchi2;
  WickedlyTamagotchi wickedlytamagotchi3;

  @Before
  public void before(){
    house1 = new House("Veritable", false, 0);
    house2 = new House("The Honky Tonk", false, 0);
    house3 = new House("Tomogatchi Groto", false, 0);
    wickedlytamagotchi1 = new WickedlyTamagotchi("Wyvern", 0, 0, 0, 0, false, 1);
    wickedlytamagotchi2 = new WickedlyTamagotchi("Testy", 8, 4, 4, 4, true, 80);
    wickedlytamagotchi3 = new WickedlyTamagotchi("Excess", 10, 0, 10, 1, true, 90);
  }

  @Test
  public void canGetName(){
    assertEquals("Veritable", house1.getName());
  }

  @Test
  public void canSetName(){
    house1.setName("Big House");
    assertEquals("Big House", house1.getName());
  }

  @Test
  public void canGetContract(){
    assertEquals(false, house1.getContract());
  }

  @Test
  public void canSetContract(){
    house1.setContract(true);
    assertEquals(true, house1.getContract());
  }

  @Test
  public void canGetDramaFactor(){
    assertEquals(0, house1.getDramaFactor());
  }

  @Test
  public void canSetDramaFactor(){
    house1.setDramaFactor(5);
    assertEquals(5, house1.getDramaFactor());
  }

  // @Test
  // public void canCountMembers(){
    
  // }


}