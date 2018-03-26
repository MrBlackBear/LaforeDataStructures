package sort;

public class ArraySel {
    private long[] array;
    private int nElems;

    public ArraySel(int max) {
        array = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        array[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(String.format("%s ", array[j]));
        }
        System.out.println("");
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
