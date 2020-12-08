/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Dec-20
 *   Time: 8:48 PM
 *   File: SampleRegex.java
 */

package Regex;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegex {
    public static void main(String[] args) {
        //Step1-> Use the pattern class to define a regular expression
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$");  //Regular Expression
        //Step 2:- Match the pattern a sequence of characters using the Matcher class
        //matcher class
        String input = JOptionPane.showInputDialog(
                null,
                "Please enter your 12 digit aadhar card number",
                "Aadhar Card Number",
                JOptionPane.PLAIN_MESSAGE
        );
        Matcher matcher = pattern.matcher(input);  //Test String
        // Methods from the java.Util.regex.Matcher Class
        /*
         * 1. matched() method
         * It is the simplest pattern matching method.It determines whether
         * the character sequence (test string) matches the pattern (regex).
         */
        if (matcher.matches()) {
            JOptionPane.showMessageDialog(
                    null,
                    "The test string is passed ",
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "The test string is Failed ",
                    "Result",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}

