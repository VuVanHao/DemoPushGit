public class NextDayCalculator {
    public static String CONCATENATION = "/";
    public static final int StartOfMonth = 1;
    public static final int EndOfYear = 12;
    public static String getNextDay(int day, int month,int year)
    {
        int EndOfMonth = getEndOfMonth(day,month,year);
        if(day == EndOfMonth)
        {
            day = StartOfMonth;
            month++;
            if(month > EndOfYear)
            {
                month = 1;
                year++;
            }
        }
        else
        {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION + year ;
    }
    private static int getEndOfMonth(int day, int month, int year ) {
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
                if (NamNhuan(year))
                {
                    EndOfMonth = 29;
                }
                else
                {
                    EndOfMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                EndOfMonth = 30;
                break;
        }
        return EndOfMonth;
    }
    private static boolean NamNhuan(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
