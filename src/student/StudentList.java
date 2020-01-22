/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author sidhu376
 */
public class StudentList {
    
    public static void main(String[] args) {
        
        Student [] sList= new Student[1];
        
        for (int i=0;i<sList.length;i++)
        {
            sList[i]=new Student();
            sList[i].setName("Student" +(i+1));
        }
        
        for (int i=0;i<sList.length;i++)
        {
            System.out.println(sList[i].getName());
          
        }
        
    }
    
}
