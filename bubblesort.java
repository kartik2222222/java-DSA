class bubblesort{

    public static int[] selectionsort(int arr[]){
       
        for(int i =0;i<arr.length-1;i++){
           int smallest = i;
           for(int j=i+1;j<arr.length;j++){
              if(arr[smallest]>arr[j]){
                smallest = j;
              }
           }
            int temp = arr[smallest];
              arr[smallest]= arr[i];
              arr[i]= temp;
        }
        return arr;
       
    }
    public static int[] bubblesort1(int arr1[]){
         for(int i=0;i<arr1.length-1;i++){
            for(int j=0;j<arr1.length-i-1;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }
            }

        }
        return arr1;
    }

    public static void printarray(int arr1[]){
        for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);
        }
    }
    public static void main(String args[]){
        int arr1[] = {2,5,4,3,1};
       
       // printarray(arr1);
        printarray(selectionsort(arr1));
    }
}