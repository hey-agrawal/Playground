public class Array_Min_Max_Element {
    public static void main(String[] args){
        int [] array =  {9,5,6,7,10,};

        int min =   array[0];
        int max = array[0];

        for (int i = 1; i< array.length; i++) {
            if (array[i]<min)
            {
                min = array[i];

            }
            if (array[i]>max){
                max = array[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

    }
}
