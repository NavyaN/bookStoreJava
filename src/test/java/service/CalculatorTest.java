package service;

import com.weCode.bookStore.Service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator cal;
    @BeforeEach
    void setUp(){
       cal  = new Calculator();
    }

    @Test
  void shouldReturnSumOfTwoNumbers(){
        int sum = cal.add(3,4);
        Assertions.assertEquals(7,sum);
  }
  @Test
  void shouldReturnDivideTwoNumber(){
        int div = cal.div(4,2);
        Assertions.assertEquals(2,div);
  }
  @Test
  void shouldReturnArthimeticExceptionWhenDivideByZero(){
        ArithmeticException arithmeticException = Assertions.assertThrows(ArithmeticException.class, ( ()-> cal.div(2,0)));
        Assertions.assertEquals("Failed to divide with zero", arithmeticException.getMessage());

  }

}
