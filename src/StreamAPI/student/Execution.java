/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Dec-20
 *   Time: 1:37 PM
 *   File: Execution.java
 */

package StreamAPI.student;

import java.util.ArrayList;

public class Execution {
    private static final int CLASS_SIZE = 10;

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < CLASS_SIZE; i++) {
            studentList.add(
                    new Student(
                            (i + 1),
                             "Name " + (i + 1),
                            Math.random() * 10.0
                    )
            );
        }
        var studentStream = studentList.stream();
        studentStream.filter(student -> student.getCpi() > 8.5).forEach(System.out::println);
    }
}

