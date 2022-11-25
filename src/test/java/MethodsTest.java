




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MethodsTest {

    @Test
    void isLongerThan20shouldReturnTrueWhenGivenAStringThatIsLongEnough() {
        //GIVEN
        String longEnough = "Das ist ein seeeeeehr langer String";
        //WHEN
        boolean actual = Methods.isLongerThan20(longEnough);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void isLongerThan20shouldReturnFalseWhenGivenAStringThatIsNotLongEnough() {
        //GIVEN
        String toShort = "";
        //WHEN
        boolean actual = Methods.isLongerThan20(toShort);
        //THEN
        assertEquals(false, actual);
    }

    @Test
    void isLongerThan20shouldReturnFalseWhenGivenAStringThatIsExactly20() {
        //GIVEN
        String toShort = "HalloWeltsHalloWelts";
        //WHEN
        boolean actual = Methods.isLongerThan20(toShort);
        //THEN
        assertEquals(false, actual);
    }

    @Test
    void shouldReturn_TheStringIsFancy_WhenFancyIsInTheStringButItsNotLongEnough() {
        //GIVEN
        String toShort = "fancy";
        //WHEN
        String actual = Methods.checkStringAndGiveMessageBack(toShort);
        //THEN
        assertEquals("The String is fancy", actual);
    }


}