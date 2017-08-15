import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ScratchyTamagotchiTest {

  ScratchyTamagotchi scratchytamagotchi1;
  ScratchyTamagotchi scratchytamagotchi2;

  @Before
  public void before(){
    scratchytamagotchi1 = new ScratchyTamagotchi("TestTamagotchi", 0, 0, 0, 0, false, 1);
    scratchytamagotchi2 = new ScratchyTamagotchi("Infinity", 5, 5, 5, 5, true, 1);
  }

  // name, hunger_level, happiness_level, drama_level, age, alive, weight

  @Test
  public void canGetName(){
    assertEquals("TestTamagotchi", scratchytamagotchi1.getName());
  }

  @Test
  public void canGetHungerLevel(){
    assertEquals(0, scratchytamagotchi1.getHungerLevel());
  }

  @Test
  public void canGetDramaLevel(){
    assertEquals(0, scratchytamagotchi1.getDramaLevel());
  }
}

// Scratchy