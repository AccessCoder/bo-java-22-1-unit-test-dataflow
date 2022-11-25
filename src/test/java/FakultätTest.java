import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultätTest {

    @Test
    void shouldReturn6IfGivenIntIs3() {
        //GIVEN
        int x = 3;
        //WHEN
        int actual = Fakultät.getFakultätOf(x);
        //THEN
        assertEquals(6,actual);
    }

    @Test
    void shouldReturn120IfGivenIntIs5() {
        //GIVEN
        int x = 5;
        //WHEN
        int actual = Fakultät.getFakultätOf(x);
        //THEN
        assertEquals(120,actual);
    }

    @Test
    void shouldReturn3628800IfGivenIntIs10() {
        //GIVEN
        int x = 10;
        //WHEN
        int actual = Fakultät.getFakultätOf(x);
        //THEN
        assertEquals(3628800,actual);
    }

    @Test
    void shouldReturn1IfGivenIntIsUnder1() {
        //GIVEN
        int x = 0;
        //WHEN
        int actual = Fakultät.getFakultätOf(x);
        //THEN
        assertEquals(1,actual);
    }

}