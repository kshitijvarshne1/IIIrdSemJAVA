/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Dec-20
 *   Time: 12:22 AM
 *   File: SampleHashSet.java
 */

package collection.HashSet;

import java.util.HashSet;

public class SampleHashSet {
    public static void main(String[] args) {
        HashSet<Integer> rollNumber= new HashSet<>();
        rollNumber.add(23);
        rollNumber.add(2);
        rollNumber.add(3);
        rollNumber.add(4);
        rollNumber.add(5);
        rollNumber.add(10);
        rollNumber.add(7);
        rollNumber.add(21);
        rollNumber.add(1);
        System.out.println(rollNumber);
        rollNumber.add(1);
        System.out.println(rollNumber);
        System.out.println("Size of hashset(rollNumber) :- "+rollNumber.size());
        //rollNumber.clear();
        System.out.println(rollNumber);

    }
}

