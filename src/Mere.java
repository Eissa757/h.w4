import java.util.ArrayList;
import java.util.Arrays;
 
public class Mere
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("E", "i", "s", "s", "a"));
         
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("S", "a", "l", "e", "h"));
         
        listOne.addAll(listTwo);    //Merge both lists
         
        System.out.println(listOne);
    }
}