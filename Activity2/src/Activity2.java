import java.io.*;
public class Activity2 {
    
    public static void main(String[] args) throws Exception {
  InputStreamReader reader =new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
  
  String InName;
  String Section;
  String Address;
  String ContactNumber;
    
  System.out.println("Type Your Name");
  InName=input.readLine();
    System.out.println("Type your Section");
   Section=input.readLine();
     System.out.println("Type Your Address");
     Address=input.readLine();
     System.out.println("Type Your ContactNumber");
     ContactNumber=input.readLine();
       System.out.println("Hi Am " +InName +"\n" +"My Section is " +Section +"\n" +"I Live in " +Address +"\n" +"My number is " +ContactNumber);
    }
}