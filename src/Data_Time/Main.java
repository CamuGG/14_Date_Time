package Data_Time;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate localDataToday = LocalDate.now();
        System.out.println(localDataToday);   // stampo data odierna

        int dayOfTheMonthCurrent = localDataToday.getDayOfMonth(); // giorno del mese corrente
        int dayOfTheYearCurrent = localDataToday.getDayOfYear(); // giorno dell'anno corrente
        int totalDayOfTheMonth = localDataToday.lengthOfMonth(); // totale giorni del mese
        int totalDayOfTheYear = localDataToday.lengthOfYear(); // totale giorni dell'anno



        System.out.println("Alla fine del mese mancano " + (totalDayOfTheMonth - dayOfTheMonthCurrent) + " giorni");
        System.out.println("Alla fine dell'anno mancano " + (totalDayOfTheYear - dayOfTheYearCurrent) + " giorni");




        /*
        LocalDate toEndOfTheMonth = localDataToday.withDayOfMonth(localDataToday.lengthOfMonth());
        long daysToTheEndOfTheMonth = localDataToday.until(toEndOfTheMonth).getDays();

        LocalDate toEndOfTheYear = LocalDate.of(localDataToday.getYear(), 12, 31);
        long dayToTheEndOfTheYear = localDataToday.until(toEndOfTheYear).getDays();

        System.out.println(toEndOfTheMonth);

        System.out.println("the days until the end of the month are: " + daysToTheEndOfTheMonth);
        System.out.println("the days until the end of the year are: " + dayToTheEndOfTheYear);

         */

    }
}
