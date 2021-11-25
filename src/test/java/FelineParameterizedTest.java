import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int countOfKittens;
    private final int expected;

    public FelineParameterizedTest(int countOfKittens, int expected){
        this.countOfKittens = countOfKittens;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getCountOfKittens() {
        return new Object[][] {
                {0, 0},
                {10, 10},
                {5, 5},
        };
    }

    @Test
    public void testUndefinedCountOfKittensGetKittens(){
        Feline feline = new Feline();
        int actual = feline.getKittens(countOfKittens);
        assertEquals(expected, actual);
    }
}
