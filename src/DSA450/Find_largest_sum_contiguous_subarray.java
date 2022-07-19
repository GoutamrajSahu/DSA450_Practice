package DSA450;

import java.util.Collections;
import java.util.Vector;

public class Find_largest_sum_contiguous_subarray {
    Find_largest_sum_contiguous_subarray(){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum < 0){
                sum = 0;
            }
        }
//        Vector<Integer> subArray = new Vector<>();
//        Vector<Integer> subArrayTemp = new Vector<>();
//        for(int i = 0; i < arr.length; i++){
//            int currentSum = 0;
//           for(int j = i; j < arr.length; j++){
//                 currentSum += arr[j];
//                 subArrayTemp.add(arr[j]);
//               if(currentSum > maxSum){
//                   maxSum = currentSum;
//                   subArray.clear();
//                   subArray.addAll(subArrayTemp);
//               }
//           }
//           subArrayTemp.clear();
//        }
        System.out.println("Max contiguous subarray sum is: "+maxSum);
//        System.out.println(subArray);
    }
}
