package lesson8.Problem1;

import java.util.Arrays;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
    private final int INITIAL_LENGTH = 3;
    private Person[] personArray;
    private int size;

    // Default Constructor
    public MyPersonList() {
        personArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person s) {
        if (s != null){
            if (size == personArray.length) {
                resize();
            }
            personArray[size] = s;
            size++;
        }
    }

    // 2. get person information by passing index
    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }

        return personArray[i];
    }

    // 3. Find the Person object using lastname
    public boolean find(String lastName) {
        if (lastName != null){
            for(Person p : personArray){
                if (p.getLast().equals(lastName)){
                    return true;
                }
            }
        }
        return false;
    }

    // 4. Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        if (lastName != null){
            boolean found = false;
            for(int i = 0; i < size; i++){
                if (personArray[i].getLast().equals(lastName)){
                    found = true;
                }
                if (found){
                    System.arraycopy(personArray, i + 1, personArray, i, --size);
                    return true;
                }
            }

        }
        return false;
    }
    // 5. Resizing the list
    private void resize() {
        personArray = Arrays.copyOf(personArray, personArray.length * 2);
    }
    // To display all the persons list
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(personArray[i] + ", \n");
        }
        sb.append(personArray[size - 1] + "]");
        return sb.toString();
    }
    // Return the size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Bruce", "Tom", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        list.remove("Bruce");
        System.out.println("\nSize() : " + list.size() + "\n" + list);
        System.out.println("\nSearching of Joe: " + list.find("Joe"));
        System.out.println(list.get(2));
    }
}