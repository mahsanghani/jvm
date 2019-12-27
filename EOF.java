import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int i=1;
        while(sc.hasNext()){
            a = sc.nextLine();
            System.out.println(i+" "+a);
            i++;
        }
    }
}

// For loop 
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   for(int i = 1; scan.hasNext()== true; i++){
       System.out.println(i + " " + scan.nextLine());
   }
}

// While loop System
public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int i = 0;
   while(scan.hasNext()){
       i++;
       System.out.println(i + " " + scan.nextLine());
   }
}
