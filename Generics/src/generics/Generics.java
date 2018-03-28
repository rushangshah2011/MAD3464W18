/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author macstudent
 */
public class Generics {

   public static < E > void printArray( E[] inputArray ){
   for(E element : inputArray ){
       System.out.printf("%s ", element);
   }
       System.out.println();
       
   }
       public static <T extends Comparable<T>> T maximum(T x,T y,T z){
       T max = x;
       if(y.compareTo(max)>0)
       {
   max = y ;       
       }
if(z.compareTo(max)>0)
       {
   max = z ;       
       }
return max;
       }
       
       
   
    
    
    public static void main(String[] args) {
        
        System.out.printf("MAX OF %d, %d, and %d is %d \n\n",3 , 4 , 5, maximum(3,4,5));
 
        System.out.printf("MAX OF %.1f, %.1f, and %.1f is %.1f \n\n",6.5 , 5.4 , 6.05, maximum(6.5,5.4,6.05));
 
        System.out.printf("MAX OF %s, %s, and %s is %s \n\n","abc" , "odssd" , "rwsfc", maximum("abc","odssd","rwsfc"));

        
        
        
        Box<Integer> intbox = new Box<Integer>();
        Box<String> strbox = new Box<String>();
        
        intbox.add(new Integer(10));
        strbox.add(new String("hello world"));

        System.out.printf("INTEGER VALUE : %d\n\n",intbox.get() );

        System.out.printf("STRING  VALUE : %s\n\n",strbox.get() );

        
        Integer[] intArray = { 1,2,3,4,5};
        Double[] doubleArray = {1.1 ,2.2 , 3.3, 4.4};
        Character[] charArray = { 'H','E','L','L','O'};
        
        System.out.println("ARRAY OF INTEGERS");
        printArray(intArray);
        System.out.println("ARRAY OF DOUBLE");
        printArray(doubleArray);
        System.out.println("ARRAY OF CHARACTERS");
        printArray(charArray);
        
        
    }
    
}

class Box<T> {
private T t;

public void add(T t){
this.t = t ;
}
public T get(){
return t ;
}



}