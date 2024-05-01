public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] unsorted = sorting.getArray();
        System.out.print("Unsorted Array: " );
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + ", ");
        }
        int[] sorted = sorting.sortArray(unsorted);
        System.out.print("\nSorted Array: ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
    }
}