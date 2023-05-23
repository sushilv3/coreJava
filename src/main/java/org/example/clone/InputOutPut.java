package org.example.clone;

public class InputOutPut {

    public static void result() {
        /*shallow cloning indicate reference object by default java follow this cloning*/

        /*deep Cloning*/
        Person p1 = new Person("1", "Sunil");
        Address a = new Address("lucknow", "Up");
        p1.setAddress(a);
        Person pp = new Person(p1);

        Person p2 = pp;
        p2.getAddress().setCity("kanpur");
        p2.setName("Amir");

        System.out.println("Name p1 : " + p1.getName() + " Address city : " + p1.getAddress().getCity() + " state : " + p1.getAddress().getState());
        System.out.println("Name p2 : " + p2.getName() + " Address city : " + p2.getAddress().getCity() + " state : " + p2.getAddress().getState());
    }
}
