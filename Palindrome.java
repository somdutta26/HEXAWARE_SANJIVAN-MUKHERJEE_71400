import java.util.*;
class Palindrome {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String str = sc.next();
    String reverse = "";
    int strlength = str.length();
    for (int i = (strlength - 1); i >=0; --i) 
        {
            reverse = reverse + str.charAt(i);
        }
    if (str.equals(reverse)) 
        {
            System.out.println(reverse + " is a Palindrome String.");
        }
    else 
        {
         System.out.println(str + " is not a Palindrome String.");
        }
  }
}
