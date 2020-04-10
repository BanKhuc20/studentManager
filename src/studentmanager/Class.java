/*
 * Palmer Pesta
 * CMPSC 221
 * 4/9/2020
 * Version 1.0
 * Purpose: To add and remove students 
 */
package studentmanager;
import java.util.LinkedList;


public class Class {
    
    LinkedList<String> studentList = new LinkedList<String>(); // Creates a linked list
    
    
    
    // @param newName This is the name input by the user
    // @return output Returns the four key aspect of the student object
    public String[] findStudent(String newName){
        String[] output = {}; // Intializes the output string list
        String name;
        String year;
        String grade;
        String major;
        
        for(int i = 0; i < studentList.size(); i++){ // Finds the student, stores, and returns the object's data 
            if (studentList[i][1] == newName){
                
                name = newName;
                year = Integer.toString(studentList[i][2]);
                grade = Integer.toString(studentList[i][3]);
                major = studentList[i][4];
                
                output = {name, year, grade, major};
                return output;
            }
        }
        

        output = {"error", "error", "error", "error"};
        return output;

        
    }
    
    // @param newName This is the name input by the user
    // @param newYear This is the year input by the user
    // @param newGrade This is the grade input by the user
    // @param newMajor This is the major input by the user
    public void addStudent(String newName, int newYear, int newGrade, String newMajor){
        String name = newName;
        int year = newYear;
        int grade = newGrade;
        String major = newMajor;
        
        
        StudentManager student = new StudentManager(name, year, grade, major); // Creates object
        
        studentList.add(student); // adds object to the list
    }
    
    // @param name This is the name input by the user
    public void removeStudent(String name){
        int index;
        for(int i = 0; i < studentList.size(); i++){ // Finds the index and then removes that object
            if (studentList[i][1] == name){
                index = studentList[i];
                studentList.remove(index);
            }
        }
    }
}
