/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Dec-20
 *   Time: 10:11 PM
 *   File: Regex2.java
 */

package Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        /*
         * 5.replace All() method
         * It replace all occurrences of the sequence specified in th method
         *
         * */
        Pattern pattern1 = Pattern.compile("Jon.*?");
        String input1 = "Jon Jonathon Frank Ken Todd";
        Matcher matcher1 = pattern1.matcher(input1);  //Test String
        System.out.println("Original Sentense:- "+ input1);
        String result= matcher1.replaceAll("Eric ");
        System.out.println("Result:- "+result);


        /*
        * 6. split() method
        * It is used to split an input sequence into individual tokens
        * */

        Pattern pattern2 = Pattern.compile("[ ,.?!;:]");
        var word = pattern2.split("abc,def.gh!ij;");
        for (String s : word) {
            System.out.println(s);
        }

    }

}

