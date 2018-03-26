package array;

public class ArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        Array arr = new Array(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();
        int searchKey = 35;
        if (arr.find(searchKey)) {
            System.out.println(String.format("Found %s", searchKey));
        } else {
            System.out.println(String.format("Can't find %s", searchKey));
        }
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();
    }
}
