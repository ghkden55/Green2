package InfiniteArray;

import java.util.Arrays;

public class InfiniteIntArray {

    private int idx = 0;

    private int[] arr = new int[3];

    public void add(int value) {

        arr[idx] = value;
        idx++;

        if (idx == arr.length) {

            int[] temp = new int[arr.length + 3];

            for (int i = 0 ; i < arr.length ; i++) {
                temp[i] = arr[i];
            }

            arr = temp;
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}
