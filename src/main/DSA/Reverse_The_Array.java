
public class Reverse_The_Array {
    public static void reverse(int []array){
        int  i = 0;
        int j = array.length-1;
         while(i<j){
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
             i++;
             j--;

         }

    }
    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+"");
        }
        System.out.println();  // for line break between two output
        reverse(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+"");
        }
    }

}
