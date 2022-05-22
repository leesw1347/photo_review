package kr.co.infopub.chapter.s158;

import java.util.Vector;

public class ObjectStudentWriteMain {
    public static void main(String[] args) {
        ObjectStudentRWG<Student> objectStudentRWG = new ObjectStudentRWG<>();
        Vector<Student> studentVector = new Vector<>();
        studentVector.add(new Student("홍길동", 17, "한양"));
        studentVector.add(new Student("홍길순", 15, "순천"));
        studentVector.add(new Student("몽룡", 20, "화천"));
        studentVector.add(new Student("춘향", 18, "삼척"));
        try {
            objectStudentRWG.write("Student.Object", studentVector);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
