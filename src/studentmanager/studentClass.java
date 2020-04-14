/**
 * Project: Student Manager Group project
 * File: studentClass.java
 * Date Created: 4/9/2020
 * 
 * @version 1.0 4/9/2020
 * @author Bryce Finch
 */

/**
 *
 * @author Bryce
 */
package studentmanager;

public class studentClass {
    // Declare and Initalize Variables
    private String studentName, studentMajor;
    private int studentYear, studentGrade;
    
    // Constructor
    /**
     * Sets the Initial Strings to "" and ints to 0
     * @param name
     * @param year
     * @param grade
     * @param major
     */
    public studentClass(String name, int year, int grade, String major) {
        this.studentName = name;
        this.studentMajor = major;
        this.studentYear = year;
        this.studentGrade = grade;
        
    }
    
    // GET Methods
    /**
     * 
     * @return the Student's Name
     */
    public String getStudentName() {
        return studentName;
        
    }
    
    /**
     * 
     * @return the Student's Major
     */
    public String getStudentMajor() {
        return studentMajor;
        
    }
    
    /**
     * 
     * @return the Student's Year
     */
    public int getStudentYear() {
        return studentYear;
     
    }
    
    /**
     * 
     * @return the Student's Grade
     */
    public int getStudentGrade() {
        return studentGrade;
        
    }
    
    // End GET Methods
    // -------------------------------------------------------------------------
    
    // SET Methods
    /**
     * Sets the Student's Name to the Given Name
     * 
     * @param sName used to set our private variable to the given value
     */
    public void setStudentName(String sName) {
        this.studentName = sName;
        
    }
    
    /**
     * Sets the Student's Major to the Given Major
     * 
     * @param sMajor used to set our private variable to the given value
     */
    public void setStudentMajor(String sMajor) {
        this.studentMajor = sMajor;
        
    }
    
    /**
     * Sets the Student's Year to the Given Year
     * 
     * @param sYear used to set our private variable to the given value
     */
    public void setStudentYear(int sYear) {
        this.studentYear = sYear;
        
    }
    
    /**
     * Sets the Students Grade to the Given Grade
     * 
     * @param sGrade used to set our private variable to the given value
     */
    public void setStudentGrade(int sGrade) {
        this.studentGrade = sGrade;
        
    }
    
    // End SET Methods
    // -------------------------------------------------------------------------
    
}
