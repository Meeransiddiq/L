import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter keys for operation:");
              key=sc.nextInt();
        switch(key)
        {
           case 1: System.out.println("Addition.");
                  break;
           case 2: System.out.println("Subtraction.");
                  break;
           case 3: System.out.println("Multiplication.");
                 break;
           case 4: System.out.println("Divide.");
                  break;
           default: System.out.println("Invalid key::");
           
        }
    }
}