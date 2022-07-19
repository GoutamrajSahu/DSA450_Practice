package DSA450;

public class Cyclically_rotate_an_array_by_one {
    Cyclically_rotate_an_array_by_one(){
    //------------------------------------Clockwise-------------------------//
        int arr1[] = {1, 2, 3, 4, 5};
        int []res = new int[arr1.length];
        int shift = 1;
        if(shift >= arr1.length){
            shift = shift % arr1.length;
        }
        int j=0;
        for(int i = arr1.length-shift; i< arr1.length; i++, j++){
            res[j] = arr1[i];
        }
        for(int i = 0; i<arr1.length-shift; i++,j++){
            res[j] = arr1[i];
        }
        for (int ele: res) {
            System.out.print(ele+" ");
        }

   //------------------------------------Anticlockwise-------------------------//
//        int []res = new int[arr1.length];
//        int shift = 1;
//        if(shift >= arr1.length){
//            shift = shift % arr1.length;
//        }
//        int j=0;
//        for(int i = shift; i< arr1.length; i++, j++){
//            res[j] = arr1[i];
//        }
//        for(int i = 0; i<shift; i++,j++){
//            res[j] = arr1[i];
//        }
//        for (int ele: res) {
//            System.out.print(ele+" ");
//        }
    }
}
