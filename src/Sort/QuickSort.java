package Sort;

import java.util.*;

public class QuickSort {
    public static void sort(Integer[] array, int l, int r) {

        int left = l; // 시작위치를 변경시킬 변수 선언
        int right = r; // 종단위치를 변경시킬 변수 선언
        int pivot = array[(l + r) / 2]; // 중앙값 pivot 선언

        while (true) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;
            if (left <= right) { // left와 right가 같은 위치 일때 서로의 index를 swap해주고 계속 진행
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
                break;
            }
        }

        System.out.println(Arrays.toString(array));
        if (l < right) sort(array, l, right); // 만약 진행한 처음 주어진 시작 위치보다 right가 크다면 즉 배열이 1개가 아니라면 진행
        if (r > left) sort(array, left, r); // 위와 마찬가지로 array의 배열이

    }

    public static List<Integer> sort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        int pivot = list.get(0);
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                low.add(list.get(i));
            } else {
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
        for (int i : list) {
            System.out.println(i);
        }

    }
}
