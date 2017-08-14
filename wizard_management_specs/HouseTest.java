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
    wickedlytamagotchi1 = new WickedlyTamagotchi("Wyvern", 0, 0, 1, 0, false, 1);
    wickedlytamagotchi2 = new WickedlyTamagotchi("Testy", 8, 4, 4, 4, true, 80);
    wickedlytamagotchi3 = new WickedlyTamagotchi("Excess", 10, 0, 10, 1, true, 90);
  }
  // name, hunger_level, happiness_level, drama_level, age, alive, weight

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

  @Test
  public void canCountMembers(){
    house1.addMember(wickedlytamagotchi1);
    assertEquals(1, house1.countMembers());
  }

  @Test
  public void canAddMember(){
    house1.addMember(wickedlytamagotchi2);
    house1.addMember(wickedlytamagotchi2);
    assertEquals(2, house1.countMembers());
  }

  @Test
  public void checkIsFull(){
    for(int i = 0; i < 10; i++){
      house1.addMember(wickedlytamagotchi1);
    }
    assertEquals(true, house1.isFull());
  }

  @Test
  public void canRemoveMember(){
    house2.addMember(wickedlytamagotchi1);
    house2.addMember(wickedlytamagotchi3);
    house2.removeMember(wickedlytamagotchi3);
    assertEquals(1, house2.countMembers());
  }

  // @Test
  // public void canComputeDramaFactor(){
  //   house2.addMember(wickedlytamagotchi1);
  //   house2.addMember(wickedlytamagotchi2);
  //   house2.addMember(wickedlytamagotchi3);
  //   house2.computeDramaFactor();
  //   assertEquals(5, house2.getDramaFactor());
  // }


}