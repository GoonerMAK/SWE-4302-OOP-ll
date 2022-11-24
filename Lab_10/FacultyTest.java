package org.example;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class FacultyTest
{

    @Test
    public void NumberOfMethodsTest()
    {
        Object faculty = new Faculty (" jubair ", "AP", 123) ;
        Method [] methods = faculty . getClass() . getDeclaredMethods () ;

        ArrayList<String> actualMethodNames = new ArrayList < >() ;

        for ( Method m : methods )
        {
              System . out . println ( m . getName () ) ;
              boolean annotationPresent = m . isAnnotationPresent ( Development_History_With_Reviewer . class ) ;
              if( annotationPresent )
              {
                   System . out . println ( m . getDeclaredAnnotations () . length ) ;
                   actualMethodNames . add ( m . getName () ) ;
              }
        }

        //  List<String> methodNameList = Arrays. asList (" research ")
        //  methodNameList.containsAll("research");

        actualMethodNames.add("wow");

        System.out.println(actualMethodNames);

       // assertTrue ( Arrays. asList (" research ") . containsAll (actualMethodNames ) ) ;

        assertTrue( Arrays. asList ("research", "teach", "wow") . containsAll (actualMethodNames ) );
    }


    @Test
    public void AnotherTest()
    {
        Object faculty = new Faculty (" WIN ", "P", 333) ;
        Method [] methods = faculty . getClass() . getDeclaredMethods () ;

        ArrayList<String> actualMethodNames = new ArrayList < >() ;

        for ( Method m : methods )
        {
            System . out . println ( m . getName () ) ;
            boolean annotationPresent = m . isAnnotationPresent ( Development_History_With_Reviewer . class ) ;
            if( annotationPresent )
            {
                System . out . println ( m . getDeclaredAnnotations () . length ) ;
                actualMethodNames . add ( m . getName () ) ;
            }
        }

        //  List<String> methodNameList = Arrays. asList (" research ")
        //  methodNameList.containsAll("research");

        actualMethodNames.add("wow");

        System.out.println(actualMethodNames);

        // assertTrue ( Arrays. asList (" research ") . containsAll (actualMethodNames ) ) ;

        assertFalse( Arrays. asList ("research", "teach", "not_wow") . containsAll (actualMethodNames ) );
    }



    @Test
    public void AnotherNewTest()
    {
        Object faculty = new Faculty (" MAK ", "N/A", 444) ;
        Method [] methods = faculty . getClass() . getDeclaredMethods () ;

        ArrayList<String> actualMethodNames = new ArrayList < >() ;

        for ( Method m : methods )
        {
            System . out . println ( m . getName () ) ;
            boolean annotationPresent = m . isAnnotationPresent ( Development_History_With_Reviewer . class ) ;
            if( annotationPresent )
            {
                System . out . println ( m . getDeclaredAnnotations () . length ) ;
                actualMethodNames . add ( m . getName () ) ;
            }
        }

        //  List<String> methodNameList = Arrays. asList (" research ")
        //  methodNameList.containsAll("research");

        actualMethodNames.add("wow");
        actualMethodNames.add("not_wow");
        actualMethodNames.add("very_wow");

        System.out.println(actualMethodNames);

        // assertTrue ( Arrays. asList (" research ") . containsAll (actualMethodNames ) ) ;

        assertFalse( Arrays. asList ("research", "teach", "very_wow") . containsAll (actualMethodNames ) );
        assertFalse( Arrays. asList ("research", "teach", "not_wow") . containsAll (actualMethodNames ) );
    }

    @Test
    public void AnotherClassTest()
    {
        Course c1 = new Course(4302, "OOP", "Lab", 1.5f);
        Course c2 = new Course(4303, "OOP", "Theory", 1.5f);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        
    }



}