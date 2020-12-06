/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Dec-20
 *   Time: 10:31 AM
 *   File: SampleAPI.java
 */

package StreamAPI;

import java.util.ArrayList;

public class SampleAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(18);
        list.add(21);
        list.add(23);
        System.out.println("Original list :- " + list);
        //Imperitive approach
        //approach use to find out smallest number
        int smallestNumber = list.get(0);
        for (Integer number : list) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        System.out.println("smallest number :- " + smallestNumber);

        //Declarative approach
        //use to find smallest number in list

        //1.Create a stream
        var stream = list.stream();
        //2.Intermediate operation
        //Declarative style of programming(defining what to do)
        var smallestNumber2 = stream.min(Integer::compare);
        System.out.println("Smallest number :- " + smallestNumber2);


    }
}

