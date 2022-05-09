public class InsertionSort {
    public static void sort(String[] array, int n)
    {
        String temp="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i].compareToIgnoreCase(array[j])>0){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    static void print(String str[], int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(str[i]+" ");
    }

    public static void main(String[] args) {
        String[] words = {"Sneha","Priyanka","Sadhana","Kavya","Vaishali"};
        int n = words.length;
        sort(words , n);
        print(words, n);

    }
}