import java.util.Scanner;

public class Sorting {
    public Scanner scanner = new Scanner(System.in);
    public int[] getArray(){
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter integer #%d: ", i+1);
            int input = Integer.parseInt(scanner.nextLine());
            array[i] = input;
        }
        return array;
    }
    public int[] sortArray(int[] array){
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;
    }

}
