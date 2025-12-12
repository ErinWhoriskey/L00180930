import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameCharacterTest {

    @Test
    void testGetHealth() {
        GameCharacter c = new GameCharacter();
        c.setHealth(100);
        assertEquals(100, c.getHealth());
    }

    @Test
    void testSetHealth() {
        GameCharacter c = new GameCharacter();
        c.setHealth(50);
        assertEquals(50, c.getHealth());
    }
}
