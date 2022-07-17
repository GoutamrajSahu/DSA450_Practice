package DSA450;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Union_and_Intersection_of_two_sorted_arrays {
    void getIntersection(int arr1[], int arr2[]){

        Vector<Integer> intersectionArr = new Vector<>();
        for(int i = 0; i<arr1.length; i++){
            if(intersectionArr.contains(arr1[i])){
                continue;
            }
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    intersectionArr.add(arr1[i]);
                }
            }
        }
        System.out.println(intersectionArr);
    }
    void getUnion(int arr1[], int arr2[]){
      Set<Integer> unionArr = new HashSet<>();
      for(int i = 0; i<arr1.length; i++){
              unionArr.add(arr1[i]);
      }
      for(int i = 0; i<arr2.length; i++){
              unionArr.add(arr2[i]);
      }
      System.out.println(unionArr);
    }

    Union_and_Intersection_of_two_sorted_arrays(){
        int arr1[] = { 1,4,5,7,8,9,15};
        int arr2[] = { 7,8,9,10,11};
        getIntersection(arr1,arr2);
        getUnion(arr1,arr2);
    }
}
