public class NextDayCalculator {
    public static String CONCATENATION = "/";
    public  static  final int EndOfMonth = 31;
    public static final int StartOfMonth = 1;
    public static String getNextDay(int day, int month,int year)
    {
        if(day == EndOfMonth)
        {
            day = StartOfMonth;
            month++;
        }
        else
        {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year ;
    }
}
