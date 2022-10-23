import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "What year were you born in? (Must be from 1950-2010): ", 1950, 2010);
        birthMonth = SafeInput.getRangedInt(in, "What month were you born in (Jan=1, Feb=2, Mar=3, Apr=4, May=5, June=6, July=7, Aug=8, Sep=9, Oct=10, Nov=11, Dec=12): ", 1, 12);

        switch (birthMonth)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            birthDay = SafeInput.getRangedInt(in, "Enter birth day (1-31): ", 1, 31);
            break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter birth day (1-28): ", 1, 28);
                break;
        }

        birthHour = SafeInput.getRangedInt(in, "What hour were you born in? (1-24): ", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "What minute were you born in? (1-59): ", 1, 59);

        System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}