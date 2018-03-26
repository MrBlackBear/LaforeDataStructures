package array;

public class Array {
    private long[] array;
    private int nElems;

    public Array(int max) {
        array = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j] == searchKey) {
                break;
            }
        }
        return j == nElems;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == array[j]) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                array[k] = array[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(String.format("%s ", array[j]));
        }
        System.out.println("");
    }
}
