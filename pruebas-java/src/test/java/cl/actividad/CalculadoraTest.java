package cl.actividad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.resta(5, 3);
        assertEquals(2, resultado);
    }
}