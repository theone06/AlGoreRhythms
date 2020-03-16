class BubbleSorter
{
    
    public void bubbleSort(int [] array)
    {
        int temp = 0;              //holder variable
        
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = 0 ; j < array.length-1; j++) 
            {
                //compare and switch
                if(array[j] > array[j+1])
                {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                
            }
            
        }
        
    }
    
    
    public static void main(String[] args)
    {
        int[] array = new int[] {20, 3, 55, 44 ,21, 100, -999};
        BubbleSorter sort = new BubbleSorter();
        sort.bubbleSort(array);
        for (int i : array)
        {
            System.out.print(i + ", ");           
        }
          System.out.println("");
    }
}