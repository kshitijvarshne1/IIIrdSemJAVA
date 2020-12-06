/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Dec-20
 *   Time: 10:59 AM
 *   File: SampleAPI2.java
 */

package StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SampleAPI2 {
    public static void main(String[] args) {
        //1.Creating a stream from an object of a class from the collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(13);
        list.add(15);
        list.add(17);
        list.add(20);
        list.add(22);
        list.add(24);
        //The Stream API is built into the classes of the collection framework
        var listStream = list.stream();
        //filter() operation (Intermediate Operation)
        listStream = listStream.filter(number -> number % 2 == 0).filter(number->number>12);
        listStream.forEach(number-> System.out.print(number +" "));
        //1.a creating a stream an array of any reference type in java
        //Primitive types can use their wrapper classes
        Double[] randomNumbers = {1.0, 2.3, 4.6, 5.2};
        //The 'java.util.Arrays' class has built-in methods to generate a stream
        var arrayStream = Arrays.stream(randomNumbers);
        //2.Create a stream by suing the interfaces provided in the 'java.util.stream' package
        //IntStream Interface
        //LongStream Interface
        //DoubleStream Interface
        var intStream = IntStream.range(1, 100);
        //[1,100)
        // a range from 1 to 99


    }
}

