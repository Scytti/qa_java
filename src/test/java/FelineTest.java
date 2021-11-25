import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private static final List<String> EXPECTED_LIST_OF_FOOD = List.of("Животные", "Птицы", "Рыба");
    private static final String EXPECTED_FAMILY = "Кошачьи";
    private static final int EXPECTED_KITTENS = 1;

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(EXPECTED_LIST_OF_FOOD, actual);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals(EXPECTED_FAMILY, actual);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(EXPECTED_KITTENS, actual);
    }

}