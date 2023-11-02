import LinearStructures.ArrayList;

public class Start {
    public static void main(String[] args){
        ArrayList<String> stringArray = new ArrayList<String>();
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        stringArray.add("bleb");
        stringArray.add("shmeeb");
        stringArray.add("splurb");

        intArray.add(0);
        intArray.add(1);
        intArray.add(2);

        System.out.println(stringArray);
        System.out.println(intArray);
    }
}
