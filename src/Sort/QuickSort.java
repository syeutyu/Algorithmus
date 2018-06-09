package Sort;

import java.util.*;

public class QuickSort {
    public static void sort(Integer[] array, int l, int r) {

        int left = l;
        int right = r;
        int pivot = array[(l + r) / 2];

        do {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }

        } while (left <= right);
        System.out.println(Arrays.toString(array));
        if (l < right) sort(array, l, right);
        if (r > left) sort(array, left, r);

    }

    public static List<Integer> sort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        int pivot = list.get(0);
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)<pivot){
                low.add(list.get(i));
            }else{
                high.add(list.get(i));
            }
        }
        List<Integer> re = sort(low);
        re.add(pivot);
        re.addAll(sort(high));
        return re;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = new Integer[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        sort(arr, 0, arr.length - 1);

        List<Integer> list = sort(Arrays.asList(arr));
        for(int i : list){
            System.out.println(i);
        }

    }
}
