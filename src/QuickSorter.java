public class QuickSorter
{
    public void quickSort(int [] arr, int low, int high)
    {
        if(low >= high){
            return;
        }
        
        if(low < high)
        {
            int part = partitionArray(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }
    public int partitionArray(int [] arr, int low, int high)
    {
        //make the middle element the pivot
        int piv = arr[(high+low)/2];
        int temp = 0;
        int i = low;
        int j = high;
        
        while(i <= j)
        {
            //while arr[i] is less than the pivot, increment
            while(arr[i] < piv)
            
                i++;
            
            //while arr[j] is greater than the pivot, decrement
            while(arr[j] > piv)
            
                j--;
            
            if(i <= j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }                 
            
        }       
        return i;
        
    }
    
    
    public static void main(String[] args)
    {
        QuickSorter sort = new QuickSorter();
        int [] array = new int[] {20, 3, 999, 55, 44 ,21, 100, -999};
        sort.quickSort(array, 0, array.length-1);
        for (int i : array) 
        {
            System.out.print(i +", ");  
        }
        System.out.println("");
   
    }
    
}
