public class ArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Index is out of bounds.");
        }
    }
}
