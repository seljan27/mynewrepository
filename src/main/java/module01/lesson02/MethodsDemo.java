package module01.lesson02;

public class MethodsDemo {

    public static void printValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i + ", Value: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 2, 15, 20};
        printValue(array);
    }
}
