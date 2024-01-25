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


    public void replace(int index, int value) {

        try {
            arr[index] = value;

        } catch (ArrayIndexOutOfBoundsException e) {
            if (index > idx) {
                int[] temp = new int[index + 1];

                for (int i = 0 ; i < arr.length ; i++) {
                    temp[i] = arr[i];
                }

                arr = temp;

                arr[index] = value;
            }
        }
    }


    public void remove(int index) {
        for (int i = index ; i < arr.length - 1 ; i++) {
            arr[i] = arr[i + 1];
        }
        idx--;
    }


    public int getElement(int index) {
        return arr[index];
    }


    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }


    public void printIndexArray(int index) {
        System.out.println(arr[index]);
    }
}
