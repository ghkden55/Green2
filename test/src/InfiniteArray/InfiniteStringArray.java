package InfiniteArray;

import java.util.Arrays;

public class InfiniteStringArray {

    private int idx = 0;

    private String[] arr = new String[3];

    public void add(String value) {

        arr[idx] = value;
        idx++;

        if (idx == arr.length) {

            String[] temp = new String[arr.length + 3];

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
