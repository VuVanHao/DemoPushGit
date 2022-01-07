public class NextDayCalculator {
    public static String CONCATENATION = "/";
    public  static  final int EndOfMonth = 31;
    public static final int StartOfMonth = 1;
    public static String getNextDay(int day, int month,int year)
    {
        int EndOfMonth = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                EndOfMonth = 31;
                break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                EndOfMonth = 30;
                break;
        }
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
