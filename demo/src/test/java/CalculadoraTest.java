import com.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(5, 0);
        });
        assertEquals("Division por cero no permitida.", exception.getMessage());
        }


    @Test
public void testSumarConLetras() {
    Exception exception = assertThrows(NumberFormatException.class, () -> {
        calc.sumar("a", "b");
    });
    assertTrue(exception.getMessage().contains("For input string"));
}


}
