package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class EmployeeDB {

    public ArrayList<Employee> allEmployees = new ArrayList<>();

    public void addEmployee(Employee e)      // impure function
    {
        allEmployees.add(e);
    }

    public ArrayList<Employee> GetEmployeeList()
    {
        return (allEmployees);
    }

    public void get()
    {
        FileReader fr = null;
        StringBuilder sb = null;

        try{
            fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);

            sb = new StringBuilder();
            String line;

            while( (line=br.readLine()) != null )
            {
                sb.append(line);
                sb.append("\n");
            }
            br.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            try
            {
                fr.close();
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        out.println("\n");
        out.println(sb);
        objectConversion(sb);

    }


    public void objectConversion(StringBuilder sb)
    {
        String[] split = sb.toString().split("\n");

        for(String s : split)
        {
            String[] lines = s.toString().split(",");

            out.println(lines[0] + " " +  lines[1] + " " + lines[2] + " " + lines[3] + " " + lines[4]);

//            int ID = Integer.parseInt(lines[1]);
//            String pattern = "yyyy-MM-dd";
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//            Date date = null;
//            Employee e = new Employee(lines[0], ID, date);

        }
    }


    public void save(Employee employee)
    {
        FileWriter fw = null;

        try
        {
            fw = new FileWriter("myfile.txt", true);
            fw.write(employee.toString() + "\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            try {
                fw.close();
            }

            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // this code will give error if there is no file
    public void anotherSave() {
        try {
            Files.write(Paths.get("myfile.txt"), "the text".getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List < Employee > add ( List < Employee > employees , Employee e )
    {
         employees . add ( e ) ;
         return employees ;
    }


    public List<Employee> ageFilter(int age)
    {
        return allEmployees.stream()
                .filter( e -> e.getAge() == age )
                .collect(Collectors.toList());
    }


    public List<Employee> salaryFilter(double salary)
    {
        return allEmployees.stream()
                .filter( e -> e.getSalary() > salary )
                .collect(Collectors.toList());
    }


}








//
//
//return  ListOfEmployees.stream()
//        .filter(e -> e.ae() == age)
//        .collect(Collectors.toList());