/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Dec-20
 *   Time: 1:32 PM
 *   File: Student.java
 */

package StreamAPI.student;

import java.util.Objects;

public class Student {
    private int rollNumber;
    private String name;
    private double cpi;

    public Student(int rollNumber, String name, double cpi) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cpi = cpi;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getCpi() {
        return cpi;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getRollNumber() == student.getRollNumber() &&
                Double.compare(student.getCpi(), getCpi()) == 0 &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNumber(), getName(), getCpi());
    }

    @Override
    public String toString() {
        return String.format(
                "%d. %s: %.2f",
                this.getRollNumber(),
                this.getName(),
                this.getCpi()
        );
    }
}

