package ec.edu.epn.tdd.calculator;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class iCalculatorTest {
    @Test
    public void given_two_integers_when_addition_then_ok(){
        iCalculator c = Mockito.mock(iCalculator.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }

}