package com.company;

	// Array Lists more flexible

        //Limitations of Arrays
        //1. Fixed number of elements; array size of 10 can't add or subtract number of elements

    // Arrays                                            vs.                           ArrayLists
    //1.Declaration:                                            1. Declaration:
    //String [] words = new String [3]                          ArrayList<String> words = new ArrayList<>();
    // ^ data type ^ array      ^ type with 3 elements          ArrayList no number at the end; can have any number of elements

    //2. Faster; compiling, efficient                           2. Slower

    //3. Assigning values                                       3. Assigning values
    //words[index]= "Carina"                                    words.add("index");
    //words[0]= "Carina"                                        words.remove("index"); //specify index or value you're removing
    //assign value to specific index of array

    //4. Printing Arrays                                        4. Printing ArrayLists (enhanced for loop: no need to specify start and end value)
    //for(int index=0; index< words.length; index++){           for (String s: words){   //different type of for loop to print values in array list
    //    System.out.println(words[index]);                           System.out.println(s); //s is individual value in words array

    //5.                                                        5. Can also store objects in class in array lists
    //                                                               and other array lists as well

   //6. Getting the size                                        6. Getting the size
    //  Arrays: words.length;                                       ArrayLists: words.size();

import java.util.ArrayList;

        public class ArrayListDemo {
            public static void main(String[] args) {

                // Create an arrayList
                ArrayList<String> al = new ArrayList<>();
                System.out.println("Initial size of al: " + al.size());

                // Add elements to the arrayList
                al.add("C");
                al.add("A");
                al.add("E");
                al.add("B");
                al.add("D");
                al.add("F");
                al.add(1, "A2");
                System.out.println("Size of al after additions: " + al.size());

                // Display the arrayList
                for (String s : al){
                    System.out.println("Contents of al: " + al);
                    break;
                }
                // Removes elements from the arrayList
                al.remove("F");
                al.remove(2);

                System.out.println("Size of al after deletions: " + al.size());

                for (String s : al) {
                    System.out.println("Contents of al: " + al);
                    break;
                }
            }
        }