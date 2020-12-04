/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Dec-20
 *   Time: 1:46 PM
 *   File: SampleMap.java
 */

package collection.Map;

import java.util.HashMap;

public class SampleMap {
    public static void main(String[] args) {
        HashMap<Integer, String> rollNumbers = new HashMap<>();
        rollNumbers.put(1, "Sam");
        rollNumbers.put(2, "Kam");
        rollNumbers.put(3, "Tam");
        System.out.println(rollNumbers);
        System.out.println("name of rollnumber 2 :- " + rollNumbers.get(2));

    }
}

