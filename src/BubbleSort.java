import java.util.Arrays;

public class BubbleSort{
    

    public void sort(int[] arr){
     int n = arr.length;
     boolean swapped= false;

       
        for(int i= 0; i < n-1; i++){ 

            for (int j = 0; j < n - 1; j++){
                if(arr[j] > arr[j+1]){
                    
                 int temp = arr[j];
                 arr[j]=arr[j+1]; 
                 arr[j+1]= temp;
                    swapped=true;
                
                
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }
}