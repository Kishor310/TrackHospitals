
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

//Arraylist values store in non contiguous way
//Uses objects only for storing data
//Data store in heap memory
//Size variable(its dynamic array changes any time)
//add(),get(),
public class ArrayList1 {
    public static void main(String[]args){
    ArrayList<Integer> list=new ArrayList<Integer>();
    //Add elements in arraylist
    list.add(1);
    list.add(5);
    list.add(11);
    System.out.println(list);
    
    //get elements from arraylist
    int getElement=list.get(0);
    System.out.println(getElement);
    
    
    //add element in between
    
    list.add(1,6);
    System.out.println(list);
    
    //set element
    list.set(1,2);
    System.out.println(list);
    //Delete Element
    
    list.remove(3);
    System.out.println(list);
    
    //find size of arraylist
    int size=list.size();
    System.out.println(size);
    
    //for loop in arraylist
    for(int i=0;i<list.size();i++){
    System.out.print(list.get(i));
    }
    System.out.println();
    
    //sorting
    Collections.sort(list);
    System.out.println(list);
    }
    
}
