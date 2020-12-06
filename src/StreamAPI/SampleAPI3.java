/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Dec-20
 *   Time: 1:01 PM
 *   File: SampleAPI3.java
 */

package StreamAPI;

import java.util.ArrayList;

public class SampleAPI3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        var stream = list.stream();
        //smallest number from the stream of integers
        var smallestNumber = stream.min(Integer::compare);
        smallestNumber.ifPresent(number -> System.out.println("The smallest number in the stream is :- " + smallestNumber.get()));

        stream = list.stream();
        //largest number from the stream of integers
        var largestNumber = stream.max(Integer::compare);
        largestNumber.ifPresent(number -> System.out.println("The largest number in the stream is :- " + largestNumber.get()));
        stream = list.stream();
        var totalEvenNumber = stream.filter(number -> number % 2 == 0).count();
        System.out.println("Total even Number :- " + totalEvenNumber);
    }
}

