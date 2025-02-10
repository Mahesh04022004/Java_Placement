
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class StringLearning{
    public static void main(String[] args) {
        // System.out.println("Hello");

        // In Java, string is basically an object that represents sequence of char values

        char[] ch = {'M','a','h','e','s','h'};
        String name = "Mahesh";

        System.out.println(Arrays.toString(ch));
        System.out.println(name);

        // The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.

        // The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. It means, we can create strings in Java by using these three classes.

        // The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.

         // There are two ways to create String object:
         // By string literal
         // By new keyword

        //  Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool

        
        String new1 = "Welcome"; //New Instance of Welcome will be created
        String new2 = "Welcome"; // No new Instance will be created

        // Q. Why java use String Literal
        // Ans. To make java more memeory efficient

        
        @SuppressWarnings("RedundantStringConstructorCall")
        String s = new String("Mahesh Mishra"); // It Will create the 2 object one in heap and another in String Constant Pool

        // String Buffer

        // What is StringBuffer?

        // StringBuffer is a class in Java that is used to create mutable (modifiable) strings. Unlike the String class, which creates immutable objects, StringBuffer allows modifications such as appending, inserting, replacing, or deleting characters without creating new objects in memory.

        // StringBuffer is synchronized, which makes it thread-safe. This means that multiple threads can work on a StringBuffer object without causing data inconsistency.

        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb = new StringBuffer();

        // String Builder 

        //What is StringBuilder?

        // StringBuilder is a Java class used to create and manipulate mutable strings, similar to StringBuffer, but without synchronization. This makes it faster than StringBuffer, but not thread-safe.

        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuilder sbb = new StringBuilder("String Builder");

        // What is StringTokenizer?

        // StringTokenizer is a Java class used to split a string into tokens (words or substrings) based on a delimiter (like space, comma, or any character).

        // StringTokenizer splits a string into words or tokens.
        // It is fast and simple but not recommended for new projects.
        // Use split() instead for better flexibility.

        StringTokenizer st = new StringTokenizer("Mahesh is good boy");  // here delimeter will be by default " "

        // Custom delimeter

        StringTokenizer st1 = new StringTokenizer("Mahesh,Gungun,mishra,bhargava",",");

        // Delimeter as Token

        StringTokenizer st2 = new StringTokenizer("1+2*3-4","+/-*",true); // pass true as third arguement


        // Using String Method 

        System.out.println("Using String Opertaion");

        String op1 = "Love is Beautiful";

        // charAt() - > return the character at that index
        

        System.out.println(op1.charAt(5));

        // length() - > return the length of string

        System.out.println(op1.length());

        // substring(int initial)

        System.out.println(op1.substring(5));

        // subString(int initial , int final) exclude the final index

        System.out.println(op1.substring(5,8));

        // contains(CharSequence ch) return true if sequence presen

        System.out.println(op1.contains("love")); // false because l is small

        // join(CharSequence delimiter, CharSequence... elements)

        String[] fruits = {"Apple","Banana","PineApple"};
        System.out.println(String.join("-", fruits));

        // equals(Object another)  
        String eq1 = "Gungun";
        String eq2 = "Gungun";
        String eq3 = new String("Gungun");

        System.out.println(eq1.equals(eq3));

        // isEmpty() -> it check weather String is empty
        String eq4 = "";

        System.out.println(eq1.isEmpty());
        System.out.println(eq4.isEmpty());

        // concat() -> It concat the String

        System.out.println(eq1.concat(eq2));

        // String replace(char old, char new) It replaces all occurrences of the specified char value.

        System.out.println(eq1.replace('n', 'l'));

        // String replace(CharSequence old, CharSequence new)
	    // It replaces all occurrences of the specified CharSequence.

        // System.out.println(eq1.replace("gul", "lul"));

        	
        // static String equalsIgnoreCase(String another)
	     // It compares another string. It doesn't check case.

         String q = "mahesh";
         String q1 = "MahesH";

         System.out.println(q.equalsIgnoreCase(q1));

        //  String[] split(String regex)
	    // It returns a split string matching regex.

        String q3 = "Mahesh is a good boy";
        String[] q4 = q3.split(" ");

        System.out.println(Arrays.toString(q4));

        // int indexOf(int ch)
	    // It returns the specified char value index.

        System.out.println(q3.indexOf('h'));

        // String trim()
	    // It removes beginning and ending spaces of this string.
        String trim = " mahesh ";
        System.out.println(trim);
        System.out.println(trim.trim());

        // Strip() -> remomve all the empty space from start and end with unicode

        String strip = " Mahesh Is A Boy \u2000";
        System.out.println(strip.strip());


        // Converting HashSet to String

        LinkedHashSet<Character>  set = new LinkedHashSet<>();
        set.add('a');
        set.add('b');
        set.add('b');

        String hashResult = set.stream().map(String::valueOf).collect(Collectors.joining(""));
        System.out.println(hashResult);




        



    }
}