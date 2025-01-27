package day8_15may;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println(" Current Date and Time: " + formattedDateTime);
    }
}
