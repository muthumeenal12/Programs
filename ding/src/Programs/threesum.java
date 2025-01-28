package Programs;

import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,8,7,4};
        int target=16;
        int[]b= threeSum(arr, target);
//        System.out.println(Arrays.toString(b));
        if(b.length==3){
            System.out.println("number to be total:"+target);
            System.out.println("Two numbers are: "+b[0]+b[1]+b[2]);}
    }
    public static int[] threeSum(int[] arr, int target) {
        // Sort the array
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] result = new int[3];
        int left, right;
        for(int i=0; i<arr.length-1; i++) {
            left = i+1;
            right = arr.length-1;
            //System.out.println(i);
            while(left<right) {
                int sum = arr[i] + arr[left] + arr[right];
                System.out.println(sum);
                if(sum == target) {
                    result[0] = arr[i];
                    result[1] = arr[left];
                    result[2] = arr[right];
                }
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
