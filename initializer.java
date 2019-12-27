import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

private static Scanner sc = new Scanner(System.in);
private static int B,H;
private static boolean flag;

static{
    B = sc.nextInt();
    H = sc.nextInt();
    sc.close();

    // try{
    //     if((B<=0) || (H<=0)){
    //     flag=false;
    //     throw new Exception("Breadth and height must be positive");
    // }}catch(Exception e){
    //     System.out.println(e);
    // }else{flag=true;}}
      
      if((B<=0) || (H<=0)){
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");}else{flag=true;}}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
