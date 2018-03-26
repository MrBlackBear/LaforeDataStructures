package array;

public class ClassDataArray {
    private Person[] array;
    private int nElems;

    public ClassDataArray(int max) {
        array = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j].getLast().equals(searchName)) {
                break;
            }
        }
        if (j == nElems) {
            return null;
        } else {
            return array[j];
        }
    }

    public void insert(String last, String first, int age) {
        array[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (array[j].getLast().equals(searchName)) {
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

    public void displayA() {
        for (int j = 0; j < nElems; j++) {
            array[j].displayPerson();
        }
        System.out.println("------------------------------------------------------");
    }
}
