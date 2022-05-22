package kr.co.infopub.chapter.s158;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
    private static final long serialVersionUID = 12234214234L;
    private String name;
    private int age;
    private String addr;

    public Student(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
//        return super.toString();
        return name + " " + age + " " + addr;
    }

    @Override
    public boolean equals(Object obj) { // 멤버 비교 - 같은객체
//        return super.equals(obj);
        boolean isE = false;
        Student temp = (Student) obj;
        if (temp.getName().equals(this.getName()) && temp.getAge() == this.getAge()
                && temp.getAddr().equals(this.getAddr())) {
            isE = true;
        }

        return isE;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        int temp = 0;
        temp = name.hashCode() + addr.hashCode() + age + 37;
        return temp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
