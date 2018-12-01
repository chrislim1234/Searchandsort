import java.util.*; //importing all util lib

public class ArrayListDemo2 //class def
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
    Collections.sort(classGrades); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                           " Collection.sort() :\n" + classGrades);
                           
    /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(classGrades, Collections.reverseOrder()); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                           " Collection.sort() :\n" + classGrades); 
  }

}