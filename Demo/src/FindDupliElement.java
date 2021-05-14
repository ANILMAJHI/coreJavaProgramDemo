import java.util.HashSet;
import java.util.Set;
 
public class FindDupliElement
{
    public static void main(String[] args) 
    {
        int[] array = {3,2,1,2,5,3,6,7,8,9};
         
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < array.length ; i++) 
        {
            //If same integer is already present then add method will return FALSE 
            if(set.add(array[i])==false) 
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
        
    }
}