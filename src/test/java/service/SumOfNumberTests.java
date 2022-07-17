package service;

import com.weCode.bookStore.Service.SumOfNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumOfNumberTests {

    SumOfNumber sum = null;
    @BeforeEach
    public void setUp(){
        sum = new SumOfNumber();
    }

    @Test
    public void SumExistsInPair(){
       boolean value = sum.SumPairExists(new int[]{2,4,5,3}, 5);
        Assertions.assertEquals(value, true);
    }

    @Test
    public void SumDoesNotExists(){
        boolean value = sum.SumPairExists(new int[]{2,3,4,5}, 11);
        Assertions.assertEquals(value, false);
    }
}
