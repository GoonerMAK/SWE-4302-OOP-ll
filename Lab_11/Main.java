package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {
        EmployeeDB employeeDB = new EmployeeDB();


        for (int i=0 ; i<3 ; i++)
        {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date date = simpleDateFormat.parse("2000-04-19");

            Employee e1 = new Employee("MAK", 14, date, i+21, i*1234f);

            employeeDB.addEmployee(e1);
            employeeDB.save(e1);

        }

        employeeDB.get();

        System.out.println(employeeDB.GetEmployeeList());

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("2010-04-19");

        Employee e2 = new Employee("DON", 34, date, 22, 1420f);

        employeeDB.add(employeeDB.allEmployees, e2);

        System.out.println(employeeDB.GetEmployeeList());

        System.out.println(employeeDB.ageFilter(22));

        System.out.println(employeeDB.salaryFilter(1420f));
    }
}




//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        Date date = simpleDateFormat.parse("2000-04-19");
//
//        Employee e1 = new Employee("MAK");
//        e1.setID((int) Math.random() + 1);
//        e1.setExperience(date);
//
//        System.out.println(e1);
//        System.out.println(e1);
//        System.out.println(e1);
//        System.out.println(e1);