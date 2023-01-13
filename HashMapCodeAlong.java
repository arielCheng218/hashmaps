import java.util.HashMap;

public class HashMapCodeAlong {

    public static void main(String[]args){
        // Create the HashMap here
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        // Use the put function to put in numbers and names of your classmates
        hashmap.put(1, "blaeeeeeeeeehhhhhhhh");
        hashmap.put(2, "bluhbluhbluhbluhbluh");
        // Use the get function to get the names of your classmates from the HashMap
        System.out.println(hashmap.get(1));
        // Use the key function to get a list of the numbers
        System.out.println(hashmap.keySet());
        // Use the values function to get list of the names
        hashmap.values();
        // Play around with it and see what else you can do
    }
}

/**
 * Hashmap is like a collection of stackable cabinets. Key = cabinet, value = what is stored in the cabinet.
 * No matter how many cabinets there are, it will always take the same amount of time to open a cabinet.
 */