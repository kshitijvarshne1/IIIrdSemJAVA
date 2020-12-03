/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Dec-20
 *   Time: 11:53 PM
 *   File: SampleList.java
 */

package collection;

import java.util.ArrayList;

public class SampleList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("Size of list :- "+list.size());
    }
}

