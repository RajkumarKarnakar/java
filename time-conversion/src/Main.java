public class Main {
    public static void main(String[] args) {
//        LocalTime time = LocalTime.now();
//        String[] times = time.toString().split(":");
//        int hour = Integer.parseInt(times[0]) - 12;
//        System.out.println(hour + ":" + times[1]);
        System.out.println(to24Hour("11:0:00PM"));
        System.out.println(to24Hour("12:0:00AM"));
    }

    static String to24Hour(String s) {
        String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        String min = str[1];
        String sec = str[2].substring(0, 2);
        String period = str[2].substring(2, 4);

        String newTimeString = "";

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM")))
            newTimeString = String.format("%02d", hour) + ":" + min + ":" + sec;
        else if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM")))
            newTimeString = (12 + hour) + ":" + min + ":" + sec;
        else if ((hour == 12) && (period.equalsIgnoreCase("AM")))
            newTimeString = "00" + ":" + min + ":" + sec;
        else if ((hour == 12) && (period.equalsIgnoreCase("PM")))
            newTimeString = hour + ":" + min + ":" + sec;
        return newTimeString;
    }
}