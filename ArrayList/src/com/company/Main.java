package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList; // import ArrayList
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> friends = new ArrayList<>();

        // add items using .add()
        friends.add("Ross");
        friends.add("Rachel");
        friends.add("Phoebe");
        friends.add("Monica");
        friends.add("Joey");
        friends.add("Chandler");

        // print items in ArrayList using a for loop
        for (String character: friends){
            System.out.println(character);
        }
        /*
        The code above should print,
            Ross     0   // remove Ross
            Rachel   1      0
            Phoebe   2      1
            Monica   3      2
            Joey     4      3
            Chandler 5      4
        */
        // print specific items by index
        System.out.println("\n\nPrint by index using get.");
        System.out.println(friends.get(0));
        System.out.println(friends.get(2));


        // remove items from ArrayList using .remove()
        System.out.println("\n\nPrint by index using get.");
        friends.remove(0); // removes Ross
        friends.remove(2); // removes Monica
        // print the items again to test if some were removed
        for (String character: friends){
            System.out.println(character);
        } // now you should see only four characters

        // change an item at a specific position
        friends.set(0, "Ross"); // Rachel is currently at 0th index.
                                // this will change Ross to Rachel
        // let's test it
        System.out.println("\n\nThis should print Ross instead of Rachel");
        System.out.println(friends.get(0));

        //print the size of ArrayList using .size()
        System.out.println(friends.size());


        // Now let's creat a new ArrayList of integers
        ArrayList<Integer> random_ints = new ArrayList<>();
        random_ints.add(23);
        random_ints.add(45);
        random_ints.add(66);

        // print random_ints
        System.out.println("\n\nPrints Random Integers from rand_ints.");
        for (int i: random_ints) {
            System.out.println(i);
        }

        // print size of rand_ints
        System.out.println("\n\nShould print the size of rand_int:");
        System.out.println(random_ints.size());


        // Similarly ArrayList with doubles
        ArrayList<Double> rand_doubles = new ArrayList<>();
        rand_doubles.add(1.23);
        rand_doubles.add(4.56);
        System.out.println("\n\nPrint rand_doubles");
        for (double i: rand_doubles) {
            System.out.println(i);
        }

        System.out.println("\n\nObserving how indices change after removal of an item: ");
        rand_doubles.remove(0);
        System.out.print(rand_doubles.get(0));
    }
}
