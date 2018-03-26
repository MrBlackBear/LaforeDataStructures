package sort;

public class ArrayInOb {
    private Person[] array;
    private int nElems;

    public ArrayInOb(int max) {
        array = new Person[max];
        nElems = 0;
    }

    public void insert(String last, String first, int age) {
        array[nElems] = new Person(last, first, age);
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            array[j].displayPerson();
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            Person temp = array[out];
            in = out;
            while (in > 0 && array[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }
}
