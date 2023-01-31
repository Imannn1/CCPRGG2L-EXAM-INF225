
package javaapplication10;


public class Recursion {

    
    public static void main(String[] args) {
         
        
        String fullName = "emmanuel tanauan";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
        String fullName = "emmanuel tanauan";
        System.out.println(fullName);
        String replaceString = fullName.replaceAll("[BbCcDdFfGgJjKkLlMmNnPpQqSsTtVvXxZzHhRrWwYy]","");
        System.out.println(replaceString);
    }
    
}
