/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetheartrate;
import java.time.*;
        
public class HeartRates {
    private String firstName;
    private String lastName;
    private int month, day, year;
    
    //Constructor
    public HeartRates(String fname, String lname, int m, int d, int y){
        firstName = fname;
        lastName = lname;
        month = m;
        day = d;
        year = y;
    }
    
    public void setFirstName(String fname){
        firstName = fname;
    }
    
    public void setLastName(String lname){
        lastName = lname;
    }
    
    public void setDOB(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getDOB(){
        return month/day/year;
    }
    
    public int getAge(){
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today).getYears();
    }
    
    public int maxHeartRate(){
        return 220 - getAge();
    }
    
    public void targetHeartRate(){
        System.out.print("Target Heart Rate: " + maxHeartRate() * 0.5 + " to " + maxHeartRate() * 0.85);
    }
}