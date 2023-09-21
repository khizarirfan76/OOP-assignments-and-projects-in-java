import java.util.ArrayList;

public class IntegerSet {
    private ArrayList<Integer> set;
    private int maxSize;


    public IntegerSet(int size) {
        set = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            set.add(0);
        }
        maxSize = size;
    }

    // Copy constructor
    public IntegerSet(IntegerSet other) {
        set = new ArrayList<>(other.set);
        maxSize = other.maxSize;
    }

    // Inserts an element into the set
    public void insertElement(int k) {
        if (k >= 0 && k < maxSize) {
            set.set(k, 1);
        } else {
            System.out.println("Invalid element: " + k);
        }
    }

    // Deletes an element from the set
    public void deleteElement(int m) {
        if (m >= 0 && m < maxSize) {
            set.set(m, 0);
        } else {
            System.out.println("Invalid element: " + m);
        }
    }

    // Prints the set
    public void printSet() {
        boolean isEmpty = true;
        for (int i = 0; i < maxSize; i++) {
            if (set.get(i) == 1) {
                System.out.print(i + " ");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("---");
        } else {
            System.out.println();
        }
    }
    public static IntegerSet unionOfSets(IntegerSet set1, IntegerSet set2) {
        if (set1.maxSize != set2.maxSize) {
            System.out.println("Sets have different sizes, cannot perform union.");
            return null;
        }

        IntegerSet unionSet = new IntegerSet(set1.maxSize);
        for (int i = 0; i < set1.maxSize; i++) {
            if (set1.set.get(i) == 1 || set2.set.get(i) == 1) {
                unionSet.set.set(i, 1);
            }
        }
        return unionSet;
    }

    // Performs the intersection of two sets and returns a new set
    public static IntegerSet intersectionOfSets(IntegerSet set1, IntegerSet set2) {
        if (set1.maxSize != set2.maxSize) {
            System.out.println("Sets have different sizes, cannot perform intersection.");
            return null;
        }

        IntegerSet intersectionSet = new IntegerSet(set1.maxSize);
        for (int i = 0; i < set1.maxSize; i++) {
            if (set1.set.get(i) == 1 && set2.set.get(i) == 1) {
                intersectionSet.set.set(i, 1);
            }
        }
        return intersectionSet;
    }

    public boolean findElement(int key) {
        if (key >= 0 && key < maxSize) {
            return set.get(key) == 1;
        } else {
            System.out.println("Invalid element: " + key);
            return false;
        }
    }
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet(10);


        set1.insertElement(2);
        set1.insertElement(5);
        set1.insertElement(7);

        System.out.print("Set 1: ");
        set1.printSet();  // Output: Set 1: 2 5 7

        IntegerSet set2 = new IntegerSet(set1);

        set2.deleteElement(5);

        System.out.print("Set 2: ");
        set2.printSet();  // Output: Set 2: 2 7

        IntegerSet unionSet = IntegerSet.unionOfSets(set1, set2);
        System.out.print("Union Set: ");
        unionSet.printSet();  // Output: Union Set: 2 7

        IntegerSet intersectionSet = IntegerSet.intersectionOfSets(set1, set2);
        System.out.print("Intersection Set: ");
        intersectionSet.printSet();  // Output: Intersection Set: 2 7

        boolean found = set1.findElement(7);
        System.out.println("Element 7 found in Set 1: " + found);  // Output: Element 7 found in Set 1: true

    }
}