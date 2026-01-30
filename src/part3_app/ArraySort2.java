package part3_app;

public class ArraySort2 {

    public static int findIndexElementArray(int[] array, int valueSearch) {

        int left = 0;

        int right = array.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == valueSearch) {

                return mid;

            } else if (array[mid] < valueSearch) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return -1;

    }

}
