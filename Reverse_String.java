//Reverse A String In Java
public class Reverse_String {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);   
    }    
}
