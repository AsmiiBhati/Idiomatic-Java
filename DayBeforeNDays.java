public class DayBeforeNDays
{
    public int dayBefore(int d, int n) {
        int repeat = n%7;
        int result = d - repeat;

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if(result<0)
        {
            result += 7;
        }
        return result;
    }
}    
