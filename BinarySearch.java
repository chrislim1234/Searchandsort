import java.util.Scanner;
public class BinarySearch{

    public static void main(String[] args){
  Scanner sc = new Scanner (System.in);
  System.out.println("How many numbers to input");
  int number = sc.nextInt();
  int[] arr = new int [number];
  for (int i = 0; i < arr.length; i++)
    {
        System.out.println("Please enter number");
        arr[i] = sc.nextInt();
    }
  int pos=binsearch(arr,56, 0 , arr.length-1);
  if(pos!=-1) System.out.println(" The values is found at the position of "+ pos);

 }

  public static int binsearch(int[] dataset,int target, int l,int u){
  
      insertsort(dataset,dataset.length);//make sure the list sorted
 
    while(u>=l){
    int mid=(l+u)/2;

    if(target==dataset[mid]) return mid;

    else if(target<dataset[mid]) u=mid-1;

    else if(target>dataset[mid]) l=mid+1;
   }

   return -1;
 }

 public static void insertsort(int[] dataset, int n)
 {

    int i, j;
    for (i = 1; i < n; i++)
    {
    int pick_item = dataset[i];
    int inserted = 0;
    for (j = i - 1; j >= 0 && inserted != 1; )
    {
        if (pick_item < dataset[j])
        {
        dataset[j + 1] = dataset[j];
        j--;
        dataset[j + 1] = pick_item;
        }
        else inserted = 1;
    }
    }

 }

}


