import java.util.Scanner;
public class SequentialSearch{
    
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
  //searching by using the sequential search technique
  int pos=seqsearch(arr,56, arr.length);
  if(pos!=-1) System.out.println(" The values is found at the position of "+ pos);

 }

 public static int seqsearch(int[] dataset,int target,int n){
  int found=0;
  int i;
  int pos=-1;
    for(i=0;i<n && found!=1;i++)
    if(target==dataset[i]){pos=i;found=1;}

  return pos;
 }

}