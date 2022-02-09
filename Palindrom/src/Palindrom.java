import java.util.Scanner;
public class Palindrom {
    
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Angka = ");
        bil=input.nextInt();
        new Palindrom().palindrome(bil);
    }

    private void palindrome(int value){		
    int r,sum=0,temp;    
    int n=value;
    
     temp=n;    
     while(n>0){    
     r=n%10;   
     sum=(sum*10)+r;    
     n=n/10;    
    }    
   if(temp==sum)    
      System.out.println(true);    
   else    
      System.out.println(false);
     
    }
    
}
