import java.util.Scanner;
public class Main {
private static String[] goodBye = {"Thank you, bye!", "I hope this helped!", "Come back again soon!"};
private static String[] ummm = {"Next time, then...", "Alright, bye...?", "I'm afraid I can't assist you any further. Farewell.", "Ok....I'm judging"};
private static String[] confusion = {"Sorry, I don't understand, please type in the given options to answer!", "Please answer with the options given!", "I don't understand what you are trying to say. Please respond with the selected options!"};


 public static void main(String[] args) throws Exception {
   Menu yum = new Menu();
   Scanner in = new Scanner(System.in);
   System.out.print("Hi, welcome to McDonalds! My name is McBot and I am here to help you understand our menu! Would you like to see it? ");
   while (true) {
     System.out.println("Please type \"yes\" to continue or \"q\" to exit.");
     String out = in.nextLine().toLowerCase();
     if (out.equals("yes")) {
       System.out.println("Our menu has a selection of burgers, drinks, and desserts. Which one would you like to know about?");
       yum.menu_check(in);
     } else if (out.equals("no")) {
       awkBye();
       System.exit(1);
     } else if (out.equals("q")) {
       bye();
       System.exit(1);
     } else {
       what();
     }
   }
 }
 public static void bye(){
   String b = goodBye[(int)(Math.random() * goodBye.length)];
   System.out.println(b);
 }
 public static void awkBye(){
   String b = ummm[(int)(Math.random() * ummm.length)];
   System.out.println(b);
 }
 public static void what() throws Exception {
   Thread.sleep(1500);
   String b = confusion[(int)(Math.random() * confusion.length)];
   System.out.println(b);
 }
}
