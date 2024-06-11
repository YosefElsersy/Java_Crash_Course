package com.company;
final public class Student { //finall class
    final int STUDENT_ID;
    String name;
    int YearOfBirth;
    final static float DEGREE_OF_SUCCESS = 50;
    // {STUDENT_ID = 200;}
    // Student(){
    //     STUDENT_ID = 20;
    // }

    public Student (int STUDENT_ID , String name, int YearOfBirth){
        STUDENT_ID = 0;
        this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.YearOfBirth = YearOfBirth;
    }
    @Override
    final public String toString() { //final method
        return "Student{" + STUDENT_ID + " ,name : " + name + " ,YearOfBirth : " + YearOfBirth+"}"  ;
    }
}

// class GraduatedStudents extends Student(){
//     public String toString() {
//         return "Student{" + STUDENT_ID + " ,name : " + name + " ,YearOfBirth : " + YearOfBirth+"}"  ;
//     }
// }