/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class demo{
   //Calculate the total amount to be paid to the shop-keeper
   public static void totalamount(String s[], int price[], int gst[], int quant[]){
      int amount=0;
      
      for(int i=0;i<price.length;i++){
         if(price[i]>=500){
        amount+=(price[i]*quant[i]+(gst[i]/100*price[i])-(5/100*price[i]));
     }
        else{
         amount+=(price[i]*quant[i]+(gst[i]/100*price[i]));
        }
      }
      
      System.out.println("amount paid to shop-keeper");
      System.out.print(amount);
   }
   public static void maxgst(String s[], int price[], int gst[], int quant[]){
      
      int amount=0;
      int count=0;
      int[] arr=new int[price.length];
      for(int i=0;i<price.length;i++){

         int maxamt=gst[i]/100*price[i]*quant[i];
           arr[i]=maxamt;

            maxamt=0;
         
      }
      System.out.println();
      int max=arr[0];
      int index=0;
      for(int i=0;i<arr.length-1;i++){
            if(max<arr[i]){
               max=arr[i];
               index=i;
            }
         }
         
       System.out.print("Maximum gst:"+s[index]);
     } 
   

   //Create a suitable data structure to hold products in the basket
   public static void holdproduct(String s[]){
      System.out.println();
      System.out.println("data stresture:");
      for(int i=0;i<s.length;i++){
         System.out.print(s[i]+" ");
     }
  }
  public static void extraele(){
     ArrayList<String>s=new ArrayList<String>();
     s.add("Leather wallet");
     s.add("umbrella");
     s.add("cigarette");
     s.add("honey");
     System.out.println();
     System.out.println("More product to basket:");
     System.out.print(s);
  }

   public static void main(String[] args) {
      String s[]={"leather wallet","umbrella","cigarette","Honey"};
     
      int price[]={1100,900,200,100};
      int gst[]={18,12,28,0};
      int quant[]={1,2,3,4};
      
      totalamount(s,price,gst,quant);  //the total amount to be paid to the shop-keeper
       maxgst(s,price,gst,quant);
       holdproduct(s);   // Create a suitable data structure to hold products in the basket
      extraele();
   }
}

   

