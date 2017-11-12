package main.java.com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = new int[10]; //Now we can store 10 integers inside intArray

        intArray[0] = 10; //Arrays start in the position 0
        intArray[1] = 8;
        intArray[5] = 20;

        System.out.println("intArray in the position 0: " + intArray[0]);
        System.out.println("intArray in the position 1: " + intArray[1]);
        System.out.println("intArray in the position 2: " + intArray[2]); //After the new, all the array's values are initialized to 0

        System.out.println("------------------");

        //Using loops to iterate on arrays
        for (int j = 0; j < intArray.length; j++) { //intArray.length returns the number of values of intArray
            System.out.println("intArray in the position " + j + ": " + intArray[j]);
        }

        //Other way to create arrays
        int[] newArray = {1, 3, 5, 7, 2}; //The

        System.out.println("------------------");

        //Other way to iterate on an array
        int i = 0;
        for (int value : newArray) {
            System.out.println("intArray in the position " + i + ": " + value);
            i++;
        }
    }
}
