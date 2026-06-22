public class demo25{
    static void selection(int[] arr){
        int size = arr.length;
        for(int step = 0; step<size-1; step++){
            int min = step;
            for(int i = 0; i<size; i++){
                if(arr[i]<arr[min]){
                    min = i;
                }
            }
            int temp = arr[step];
            arr[step] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){{
        int size = sc.nextInt();
        int[] a = new int[size]
    }}
}