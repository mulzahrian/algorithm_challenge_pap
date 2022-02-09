import java.util.Scanner;
public class Phone {
    
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();  
        if(str.equals("setyo"))
        {
            System.out.print("setyo==081218731");
        }
        else if(str.equals("ari"))
        {
            System.out.print("ari==0838911203");
        }
        else if(str.equals("budi"))
        {
            System.out.print("budi==089812102");
        }
        else
        {
            System.out.print(str + " Not Found ");
        }
    }
}
