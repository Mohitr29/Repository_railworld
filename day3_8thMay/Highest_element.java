package day3_8thMay;

public class Highest_element {
    public static Integer findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }
        return null; // No such element found
    }

    public static void main(String[] args) {
        int[] array = {18,55,25,65,85,95};
        Integer peakElement = findPeak(array);
        if (peakElement != null) {
            System.out.println("Peak element " + peakElement);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
