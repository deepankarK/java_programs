package Project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StudentID {
    private String name[];
    private int age[];
    private String bloodGroup[];

    public StudentID() {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public String[] getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String[] bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "StudentID{" +
                "name=" + Arrays.toString(name) +
                ", age=" + Arrays.toString(age) +
                ", bloodGroup=" + Arrays.toString(bloodGroup) +
                '}';
    }
}