import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzWhenNumberIs3(){
        //GIVEN
        int num = 3;
        //WHEN
        String actual = FizzBuzz.fizzbuzz(num);
        //THEN
        assertEquals("Fizz", actual);
    }



}