/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Hello {
    public static void main(String[] args) {
        int number = 10;
        float percentage;
        char vowel = 'a';
        String name = "RUSHANG";
                
        
        System.out.println("number = " + number);
        
        percentage = 78.6f;
        System.out.println("Percentage = " + percentage);
        
        System.out.println("Vowel = " + vowel);
        System.out.println("Name : " + name);
        
        percentage = 10;
        //number = 65.17;
        
        vowel = 35;
        number = 'J';
        
        System.out.println("Vowel = " + vowel);
        System.out.println("number = " + number + 12);
        
        System.out.println(1 + 2 + "test");
        
        number = 20;
        if(number > 10) {
            System.out.println("more than 10");
        }
        else if(number == 10) {
            System.out.println("equal to 10");
        }
                
        switch(number) {
            case 10 : 
                System.out.println("Value = 10");
                break;
            case 20 : 
                System.out.println("Value = 20");
                break;
            case 30 : 
                System.out.println("Value = 30");
                break;
            default : 
                System.out.println("no matching value");
                break;
        }
        
        vowel = 'a';
        switch(vowel) {
            case ('a' | 'e' | 'i' | 'o' | 'u')  : 
                System.out.println("Vowel");
                break;
            default : 
                System.out.println("Not a Vowel");
                break;
        }
        
        String province = "Alberta";
        switch(province) {
            case "Ontario" : 
                System.out.println("ON");
                break;
            case "Alberta" : 
                System.out.println("AB");
                break;
            case "Prince Edward" : 
                System.out.println("PE");
                break;
            default:
                System.out.println("Unavailable");
                break;
        }
        
        int numbers[] = new int[5];
        
        for(int i=0;i<4;i++) {
            numbers[i] = (int)(Math.random()*100);
            System.out.println("numbers [" + i + "] = " + numbers[i]);
        }
        
        double PI_VALUE = Math.PI;
        double power = Math.pow(2,2);
        System.out.println("2^2 = " + power);
        
        int sqrt = (int) Math.sqrt(81);
        System.out.println("sqrt(81) = "+sqrt);
        
        Math.abs(PI_VALUE);
        
        float grades[][] = new float [3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                grades[i][j] = 10.0f;
            }
        }
        
        int randomNo;
        for (int i = 0; i < 10; i++) {
            randomNo = (int)(Math.random()*1000);
            System.out.println("no " + (i+1) + " = " + randomNo);
        }
        
        System.out.println("******Task 1****");
        System.out.println();
        //String a[][];
        int i;
        for(i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++ ){
        
        if(i == 0 || i == 4 || j == 0 || j == 4){
        System.out.print("* ");
        
        }
        
             /* else if(i == j ) {
                 System.out.println("");
      
                  
               System.out.print("*");                   
                }*/
        else {
            
               System.out.print("  ");
           }
        }
        System.out.println("");
        
        
        }
        
        
                
     
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
}