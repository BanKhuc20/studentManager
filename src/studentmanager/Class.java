/*
 * Palmer Pesta
 * CMPSC 221
 * 4/9/2020
 * Version 1.0
 * Purpose: To add and remove students 
 */
package studentmanager;
import java.util.ArrayList;
import java.util.LinkedList;


public class Class {
    
    ArrayList studentList = new ArrayList(); // Creates an arrayList
    
    // @param newName This is the name input by the user
    // @return output Returns the four key aspect of the student object
    public LinkedList findStudent(String newName){
        LinkedList output = new LinkedList(); // Intializes the output string list
        String name;
        int year;
        int grade;
        String major;
        
        for(int i = 0; i < studentList.size(); i++){ // Finds the student, stores, and returns the object's data 
            if (studentList.get(i).getName() == newName){
                
                name = newName;
                year =  studentList.get(i).getYear();
                grade = studentList.get(i).getGrade();
                major = studentList.get(i).getMajor();
                
                output = new LinkedList();
                output.add(name);
                output.add(year);
                output.add(grade);
                output.add(major);
                return output;
            }
        }
        

        output.add("null");
        output.add(0);
        output.add(0);
        output.add("null");
        return output;
    }
    
    // @param newName This is the name input by the user
    // @param newYear This is the year input by the user
    // @param newGrade This is the grade input by the user
    // @param newMajor This is the major input by the user
    public void addStudent(String newName, int newYear, int newGrade, String newMajor){
        
        studentClass student = new studentClass(newName, newYear, newGrade, newMajor); // Creates object
        
        studentList.add(student); // adds object to the list
    }
    
    // @param name This is the name input by the user
    public void removeStudent(String name){
        for(int i = 0; i < studentList.size(); i++){ // Finds the index and then removes that object
            if (studentList.get(i).getName() == name){
                studentList.remove(i);
            }
        }
    }
}
