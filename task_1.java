import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Ожидалось, что для возраста 19 лет метод вернет true", true, isAdult);
    }
}

class Program {
    public boolean checkIsAdult(int age) {
        return age >= 18;
    }
}