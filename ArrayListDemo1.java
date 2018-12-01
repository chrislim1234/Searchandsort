import java.util.*; //importing all util lib

public class ArrayListDemo1 //class def
{
  public static void main(String[] args) //main method
  {
    // Create the ArrayList named `classGrades` and set its type to `Integer`
    ArrayList<Integer> classGrades = new ArrayList<Integer>();
    
    // Add the grades to our ArrayList
    for (int i=0; i<10; i++)
    {
        //Math.random() -> 0-<1
        //Math.random()*100 -> 0*100-<1*100 (0-99)
        //Math.random()*100+1 -> 0*100+1-<1*100+1 (1-100)        
        classGrades.add((int)(Math.random()*100+1));
    }
    for (int i=0; i<10; i++)
    {    
      System.out.println(classGrades.get(i));
    }
    boolean retrieval = classGrades.contains(10); 
        
      if (retrieval == true) {
         System.out.println("element 10 is contained in the list");
      } else {
         System.out.println("element 10 is not contained in the list");
      }
  }

}