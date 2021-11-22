package de.htw;
import de.htw.console.Implementation.Console;
import org.junit.Assert;
import org.junit.Test;
import java.util.NoSuchElementException;
import static org.junit.Assert.*;

//checking if our reading function returns expected value with "1", "sheldon" and "Milch macht munter"
public class ConsoleTest {
    private Object Exception;
    Console console = new Console();
    @Test public void checkingANumber()  {
        int numberOne = console.readInteger("1");
        Assert.assertEquals(1, numberOne);
    }
    @Test public void chekingAString() throws Exception {
        Throwable exception = assertThrows(NoSuchElementException.class, () -> console.readInteger("Scheldon"));
        assertNull(exception.getMessage());
    }
    @Test public void chekingAnotherString() throws Exception {
        Throwable exception = assertThrows(NoSuchElementException.class, () -> console.readInteger("Milch macht munter"));
        assertNull(exception.getMessage());
    }
    @Test public void checkingTrimFunction() {
        assertEquals("sheldon cooper", console.readString("      Sheldon Cooper   "));
        assertEquals("ted" , console.readString("Ted"));
        assertEquals("    r   n t" , console.readString("  %&/\\r?\"\\n\\t   "));
    }
}
