public class NextDayCalculator {
    public static String CONCATENATION = "/";
    public static final int StartOfMonth = 1;
    public static final int EndOfYear = 12;
    public static final int StartOfYear = 1;

    public static String getNextDay(int day, int month,int year)
    {
        if(NgayHopLe(day,month,year))
        {
            int EndOfMonth = getEndOfMonth(day,month,year);
            if(day == EndOfMonth)
            {
                day = StartOfMonth;
                month++;
                if(month > EndOfYear)
                {
                    month = StartOfYear;
                    year++;
                }
            }
            else
            {
                day++;
            }
            return day + CONCATENATION + month + CONCATENATION + year;
        }
        else
        {
            return "Ngày Không Hợp Lệ";
        }
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
    private static boolean NgayHopLe( int day,int month,int year)
    {
        boolean bResult = true; // Giả sử ngày hợp lệ
        if (!(year > 0 && month > 0))
        {
            bResult = false; // Kiểm tra tính hợp lệ của năm
        }
        if (!(month >= 1 && month <= 12))
        {
            bResult = false; // Kiểm tra tính hợp lệ của tháng
        }
        if (!(day >= 1 && day <= getEndOfMonth(day,month,year)))
        {
            bResult = false; // Kiểm tra tính hợp lệ của ngày
        }
        return bResult;
    }
}
