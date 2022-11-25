public class Alarm {


    public static String anyMoreCustomersAllowed(int customers, String alarmLevel) {
        int allowedCustomers = giveAllowedAmountForAlarmLevel(alarmLevel);
        if (customers>allowedCustomers){
            return "Zu viele Personen";
        }else {
            return "Maximale Personenzahl nicht Überschritten";
        }

    }

    public static int giveAllowedAmountForAlarmLevel(String alarmLevel){
        switch (alarmLevel){
            case "yellow":
                return 30;
            case "green":
                return 60;
            default:
                return 0;
        }

    }
}
