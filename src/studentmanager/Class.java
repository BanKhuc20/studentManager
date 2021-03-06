/*
 * Palmer Pesta
 * CMPSC 221
 * 4/9/2020
 * Version 1.0
 * Purpose: To add and remove students 
 */
package studentmanager;
import java.util.ArrayList;


public class Class {
    
    ArrayList studentList = new ArrayList(); // Creates an arrayList
    
    // @param newName This is the name input by the user
    // @return output Returns the four key aspect of the student object
    public ArrayList findStudent(String newName){
        ArrayList output = new ArrayList(); // Intializes the output string list
        String name;
        int year;
        int grade;
        String major;
        
        for(int i = 0; i < studentList.size(); i++){ // Finds the student, stores, and returns the object's data
            studentClass test = (studentClass) studentList.get(i);
            if (test.getStudentName() == null ? newName == null : test.getStudentName().equals(newName)){
                
                name = newName;
                year =  test.getStudentYear();
                grade = test.getStudentGrade();
                major = test.getStudentMajor();
                
                output = new ArrayList();
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
            studentClass test = (studentClass) studentList.get(i);
            if (test.getStudentName() == null ? name == null : test.getStudentName().equals(name)){
                studentList.remove(i);
            }
        }
    }
}
