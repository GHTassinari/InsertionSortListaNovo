public class Main {
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();

        int[] array1 = {5, 2, 9, 1, 5, 6};
        int[] array2 = {3, 8, 7, 4, 2, 9};

        System.out.println("Array original:");
        sorter.printArray(array1);

        sorter.sort(array1);
        System.out.println("Array ordenado de forma crescente:");
        sorter.printArray(array1);

        System.out.println("Array original:");
        sorter.printArray(array2);

        sorter.sort(array2, true);
        System.out.println("Array ordenado de forma decrescente:");
        sorter.printArray(array2);
    }
}