package DSA450;

import java.util.*;

public class Minimise_the_maximum_difference_between_heights {
    Minimise_the_maximum_difference_between_heights(){
        int arr[] = {2, 6 ,3 ,4 ,7 ,2 ,10 ,3 ,2 ,1};
//        System.out.println(new HashSet<>(Arrays.asList(2, 6 ,3 ,6 ,3 ,2 ,10 ,3 ,2 ,3)));
        int k = 5;
        int []res = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]< k){
                res[i] = arr[i]+k;
            }else if(arr[i] == k){
                res[i] = arr[i]+k;
            }else if(arr[i] > k){
                res[i] = arr[i]-k;
            }
        }
        int min = res[0];
        int max = res[0];
        // for (int ele:
        //      res) {
        //     System.out.print(ele+" ");
        // }
        for(int i=1; i<res.length; i++){
            if(min>res[i]){
                min = res[i];
            }
            if(max<res[i]){
                max = res[i];
            }
        }

        System.out.println(max-min);
    }
}
