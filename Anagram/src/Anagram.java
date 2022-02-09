import java.util.Scanner;
public class Anagram {
    
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Enter x Value: ");  
        String X= sc.nextLine();
        System.out.print("Enter y Value: ");  
        String Y= sc.nextLine();  
        System.out.print(new Anagram().isAnagram(X,Y)); 
    }

    public boolean isAnagram(String x, String y) {
        if(x==null || y==null)
            return false;
     
        if(x.length()!=y.length())
            return false;
     
        int[] arr = new int[26];
        for(int i=0; i<x.length(); i++){
            arr[x.charAt(i)-'a']++;
            arr[y.charAt(i)-'a']--;
        }
     
        for(int i: arr){
            if(i!=0)
                return false;
        }
     
        return true;
    }
}
