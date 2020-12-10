/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Dec-20
 *   Time: 12:30 PM
 *   File: Sample2.java
 */

package GenericProgramming;

/*
* Generics : For Creating
* 1.Generics Class
* 2.Generics Method
* 3.Generics Interface
* If you create a class as a "generic class. you can send the 'type' of the data
* you want to operate on as a parameter to the class.
* */

public class Sample2<T> {
    public void method1(T parameter){
        System.out.println(parameter.getClass().getSimpleName());
    }

    public static void main(String[] args) {
    Sample2<Integer> object = new Sample2<Integer>();
    object.method1(5);
    }

}

