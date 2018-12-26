package boj.sort;

public class MergeSort {
    public void mergeSort(int[] a, int[] temp, int left, int right) {
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            mergeSort(a, temp, left, mid);
            mergeSort(a, temp, mid + 1, right);
            merge(a, temp, left, mid + 1, right);
        }
    }

    public void merge(int[] a, int[] temp, int left, int mid, int right) {
        int i, left_end, size, temp_pos;
        left_end = mid - 1;
        temp_pos = left;
        size = right - left + 1;
        while((left <= left_end) && (mid <= right)) {
            if (a[left] <= a[mid]) {
                temp[temp_pos] = a[left];
                temp_pos = temp_pos + 1;
            }
        }
    }
}
