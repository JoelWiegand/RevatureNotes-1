import java.util.Scanner;

/**
 * hello world
 */
public class helloworld {
    public static void main(String[] args) {
        System.out.print("Hello Cruel World!");
        for (String string : args) {
			System.out.println(string);
		}
        
       Scanner s  = new Scanner(System.in);
    }

}