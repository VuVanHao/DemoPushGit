public class NextDayCalculator {
    public static String CONCATENATION = "/";
    public static String getNextDay(int day, int month,int year)
    {
        return ++day + CONCATENATION + month + CONCATENATION + year ;
    }
}