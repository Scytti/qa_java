import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LionException {

    private static final String SEX = "Иное";

    Feline feline;

    @Test
    public void testLionException() {
        try {
            Lion lion = new Lion(SEX, feline);
        } catch (Exception e) {
            assertEquals(e.getMessage(),"Используйте допустимые значения пола животного - самей или самка");
        }
    }
}
