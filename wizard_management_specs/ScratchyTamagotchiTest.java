import wizard_management.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ScratchyTamagotchiTest {

  ScratchyTamagotchi scratchytamagotchi;

  @Before
  public void before(){
    scratchytamagotchi = new ScratchyTamagotchi("TestTamagotchi", 0, 0, 0, 0);
  }

  @Test
  public void canGetName(){
    assertEquals("TestTamagotchi", scratchytamagotchi.getName());
  }

  @Test
  public void canGetHungerLevel(){
    assertEquals(0, scratchytamagotchi.getHungerLevel());
  }

  @Test
  public void canGetDramaLevel(){
    assertEquals(0, scratchytamagotchi.getDramaLevel());
  }
}

// Scratchy