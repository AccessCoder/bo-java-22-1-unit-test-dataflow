import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void shouldReturn_ZuVielePersonen_WhenOver30(){
        //GIVEN
        int customers = 31;
        //WHEN
        String actual = Alarm.anyMoreCustomersAllowed(customers, "yellow");
        //THEN
        assertEquals("Zu viele Personen", actual);
    }

    @Test
    void shouldReturn_MaximalePersonenzahlNichtÜberschritten_WhenUnder30(){
        //GIVEN
        int customers = 29;
        //WHEN
        String actual = Alarm.anyMoreCustomersAllowed(customers, "yellow");
        //THEN
        assertEquals("Maximale Personenzahl nicht Überschritten", actual);
    }

    @Test
    void shouldReturn_MaximalePersonenzahlNichtÜberschritten_WhenExactly30(){
        //GIVEN
        int customers = 30;
        //WHEN
        String actual = Alarm.anyMoreCustomersAllowed(customers, "yellow");
        //THEN
        assertEquals("Maximale Personenzahl nicht Überschritten", actual);
    }

    @Test
    void shouldReturn_0_WhenAlarmIsRed(){
        //GIVEN
        String alarm = "red";
        //WHEN
        int actual = Alarm.giveAllowedAmountForAlarmLevel(alarm);
        //THEN
        assertEquals(0, actual);
    }

    @Test
    void shouldReturn_30_WhenAlarmIsYellow(){
        //GIVEN
        String alarm = "yellow";
        //WHEN
        int actual = Alarm.giveAllowedAmountForAlarmLevel(alarm);
        //THEN
        assertEquals(30, actual);
    }

    @Test
    void shouldReturn_60_WhenAlarmIsGreen(){
        //GIVEN
        String alarm = "green";
        //WHEN
        int actual = Alarm.giveAllowedAmountForAlarmLevel(alarm);
        //THEN
        assertEquals(60, actual);
    }

    @Test
    void shouldReturn_0_WhenAlarmIsNeitherRedYellowOrGreen(){
        //GIVEN
        String alarm = "Hummus";
        //WHEN
        int actual = Alarm.giveAllowedAmountForAlarmLevel(alarm);
        //THEN
        assertEquals(0, actual);
    }

}