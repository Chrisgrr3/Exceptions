import java.util.ArrayList;

public class ExceptionList {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {
            try {
            Integer castedVal = (Integer) myList.get(i);
            System.out.println("Added " + String.valueOf(castedVal) + " to the list.");
            } catch (ClassCastException e){
                String errorIndex = String.valueOf(i);
                String value = String.valueOf(myList.get(i));
                System.out.println("ERROR: Cannot cast item to Integer. The error occurred at index " +
                errorIndex + " and the value of the object was " + value + ".");
            }
        }
        System.out.println("Complete");
    }
}