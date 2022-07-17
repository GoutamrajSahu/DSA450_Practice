package DSA450;

public class Find_min_and_max_ele_in_array {
    Find_min_and_max_ele_in_array(){
        int arr[] = {2,3,2,7,5,1,9,10,4};
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
            else if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
