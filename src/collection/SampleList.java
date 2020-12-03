/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Dec-20
 *   Time: 11:53 PM
 *   File: SampleList.java
 */

package collection;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

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
        System.out.println("Size of list :- " + list.size());


        ArrayList<Contact> contactsList = new ArrayList<>();
        Contact friend1 = new Contact("Sam", "Singh", 1234569875);
        Contact friend2 = new Contact("Dam", "Singh", 1234889875);
        contactsList.add(friend1);
        contactsList.add(friend2);
        System.out.println(contactsList);


    }
}

class Contact {
    private String contactFirstName;
    private String contactlastName;
    private long phoneNumber;

    public Contact(String contactFirstName, String contactlastName, long phoneNumber) {
        this.contactFirstName = contactFirstName;
        this.contactlastName = contactlastName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactFirstName='" + contactFirstName + '\'' +
                ", contactlastName='" + contactlastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumber == contact.phoneNumber &&
                Objects.equals(contactFirstName, contact.contactFirstName) &&
                Objects.equals(contactlastName, contact.contactlastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactFirstName, contactlastName, phoneNumber);
    }
}
