import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    static final String EXPECTED_SOUND_FROM_CAT = "Мяу";

    @Mock
    Feline feline;

    @Test
    public void testGetSound(){
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals(EXPECTED_SOUND_FROM_CAT, actual);
    }

    @Test
    public void testGetFoodForCat() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }
}