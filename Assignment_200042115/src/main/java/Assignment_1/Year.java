package Assignment_1;

public class Year
 {
     int year;

     Year(int year) {this.year = year;}

     public boolean LeapYear() { return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); }
 }


