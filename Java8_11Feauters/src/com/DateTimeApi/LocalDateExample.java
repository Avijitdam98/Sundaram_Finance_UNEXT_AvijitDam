package com.DateTimeApi;
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        //!cretae a spacific date
        LocalDate specificDate = LocalDate.of(2000, 1, 1);
        System.out.println(specificDate);

        //!futureDate
        LocalDate futureDate = LocalDate.now().plusDays(5);
        System.out.println("5 days latter "+futureDate);

        //!past date
        LocalDate pastDate = LocalDate.now().minusDays(5);
        System.out.println("5 days before "+pastDate);

        //!Past Week
        LocalDate passWeek=LocalDate.now().minusWeeks(1);
        System.out.println("1 week before "+passWeek);

        //! Past Month
        LocalDate passMonth=LocalDate.now().minusMonths(1);
        System.out.println("1 Month before "+passMonth);
    }
}
