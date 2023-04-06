import static org.junit.jupiter.api.Assertions.*;

public class MainTests {
    @org.junit.jupiter.api.Test
    void countCharactersHappyPath() {
        int count = Main.countCharacters("Hello world!", false);
        assertEquals(9, count);
    }

    @org.junit.jupiter.api.Test
    void countCharactersCaseInsensitive() {
        int count = Main.countCharacters("Hhello wWorld!", true);
        assertEquals(9, count);
    }

    @org.junit.jupiter.api.Test
    void countCharactersCaseSensitive() {
        int count = Main.countCharacters("Hhello wWorld!", false);
        assertEquals(11, count);
    }
}
