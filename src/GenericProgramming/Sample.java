/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Dec-20
 *   Time: 12:04 PM
 *   File: Sample.java
 */

package GenericProgramming;

public class Sample {
    public void method1(Object number){
        System.out.println("Parameter value:- "+number);
        System.out.println("Type of parameter is now :- "+number.getClass().getSimpleName());
    }

    public void method2(Object name){
        System.out.println("Parameter value:- "+name);
        System.out.println("Type of parameter is now :- "+name.getClass().getSimpleName());
    }

    public Object method3(Object number){
        System.out.println("Parameter value:- "+number);
        System.out.println("Type of parameter is now :- "+number.getClass().getSimpleName());
        return number;
    }

    public static void main(String[] args) {
        Sample demo1 = new Sample();
        demo1.method1(78);
        demo1.method2("Ram");
        Object value = demo1.method3("ds");

    }
}

//This idea of making Object(parent class of all child class) is not working when we return the value from method
