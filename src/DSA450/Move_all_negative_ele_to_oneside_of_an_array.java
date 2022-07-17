package DSA450;

public class Move_all_negative_ele_to_oneside_of_an_array {
    Move_all_negative_ele_to_oneside_of_an_array(){
      int arr[] = { 1, 2, -4, -5, 2, -7, 3,
              2, -6, -8, -9, 3, 2,  1 };

//      int currentFilledFirstIndex = 0;
//      int currentFilledLastIndex = arr.length-1;
//      while(currentFilledFirstIndex<=currentFilledLastIndex){
//
//           if(arr[currentFilledFirstIndex]<0 && arr[currentFilledLastIndex]<0){
//               currentFilledFirstIndex++;
//           }else if(arr[currentFilledFirstIndex]>0 && arr[currentFilledLastIndex]<0){
//               int temp = 0;
//               temp = arr[currentFilledFirstIndex];
//               arr[currentFilledFirstIndex] = temp;
//               arr[currentFilledLastIndex] = temp;
//           }else if(arr[currentFilledFirstIndex]>0 && arr[currentFilledLastIndex]>0){
//               currentFilledLastIndex--;
//           }else{
//               currentFilledFirstIndex++;
//               currentFilledLastIndex--;
//           }
//
//      }

      int CurrentFilledIndex = -1;
      for(int i=0; i<arr.length; i++){
          if(arr[i] < 0){
              int temp;
              temp = arr[++CurrentFilledIndex];
              arr[CurrentFilledIndex] = arr[i];
              arr[i] = temp;
          }
      }
      for (int res: arr) {
            System.out.print(res+" ");
        }
    }
}
