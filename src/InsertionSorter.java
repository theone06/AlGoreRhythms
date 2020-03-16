class InsertionSorter
{
    public void insertSort(int [] array)
    {
        int temp = 0; 
        
        for(int i = 1; i < array.length; i++)
        {
            int j = i;
            
            while(j > 0 && array[j] < array[j-1])
            {
                //swap
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
          
        }       
        
    }
    public static void main(String [] args)
    {
        int [] array = new int[] {20, 3, 55, 44 ,21, 100, -999};

        InsertionSorter sort = new InsertionSorter();
        sort.insertSort(array);

        for(int x: array)
        {
            System.out.print(x + ", ");
        }
        System.out.println();
    }


}