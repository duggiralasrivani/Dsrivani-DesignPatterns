package creationalPattern_Prototype;
import java.io.*;  
import java.util.*;
 
 class PrototypeDemo{  
     public static void main(String[] args) throws IOException {  
          
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
          
        System.out.print("Enter Car Name: ");  
        String cname=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter car Model: ");  
        String cmodel=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter car fuel: ");  
        String cfuel=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter car price: ");  
        double cprice= Double.parseDouble(br.readLine());  
        System.out.print("\n");  
           
        CarsConcreteclass cc1=new CarsConcreteclass( cname,cmodel,cfuel,cprice);  
          
        cc1.print();  
        System.out.println("\n");  
        CarsConcreteclass cc2=(CarsConcreteclass) cc1.getClone();  
        cc2.print();  
    }     
}