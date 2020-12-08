/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Dec-20
 *   Time: 8:48 PM
 *   File: SampleRegex.java
 */

package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegex {
    public static void main(String[] args) {
        //Step1-> Use the pattern class to define a regular expression
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}[ ]$");  //Regular Expression
        //Step 2:- Match the pattern a sequence of characters using the Matcher class
        Matcher matcher = pattern.matcher("1234 5678 1234");  //Test String
        // Methods from the java.Util.regex.Matcher Class

    }
}

