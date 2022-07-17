package DSA450;

public class Find_Kth_min_and_max_ele_in_array {
    Find_Kth_min_and_max_ele_in_array(){
        int kth = 3;
    int arr[] = {2,3,7,5,1,9,10,4};
        for(int i = arr.length-1; i>=0; i--){
             for(int j = 0; j<i; j++){
                 if(arr[j+1] < arr[j]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
        }
        System.out.print("Sorted array: ");
        for (int res:
                arr) {
            System.out.print(res+" ");
        }
        System.out.println();
        System.out.println(kth+ "th min ele: " +arr[kth-1]);
        System.out.println(kth+ "th max ele: " +arr[(arr.length) - kth]);
    }
}
