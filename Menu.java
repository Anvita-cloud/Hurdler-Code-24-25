import java.util.Scanner;


public class Menu {
   private String[] disappointment = {"Sorry, I don't understand. Please respond with one of our menu choices!", "Please type one of the options!", "I don't understand what you are trying to say, try typing a menu item!"};
   public Menu() {}
   MenuItem bigmac = new MenuItem("Big Mac", 590, 5.29);
   MenuItem chicken = new MenuItem("McChicken", 400, 3.09);
   MenuItem cheeseburger = new MenuItem("Cheeseburger", 300, 2.39);
   MenuItem soda = new MenuItem("Coke", 150, 2.59);
   MenuItem aj = new MenuItem("Apple Juice", 35, 1.89);
   MenuItem hotcoco = new MenuItem("Hot Chocolate", 370, 2.09);
   MenuItem icecream = new MenuItem("Oreo McFlurry", 510, 4.39);
   MenuItem cookie = new MenuItem("Chocolate Chip Cookie", 170, 0.39);
   MenuItem pie = new MenuItem("Baked Apple Pie", 230, 1.89);


   public void menu_check(Scanner in) throws Exception {
       String ns = in.nextLine().toLowerCase();
       if (ns.contains("burger")) {
           check_burger();
           String choice = "Is there anything else on our burger menu that you would like to know about? Type \"yes\" if so. If not, please press \"back\" to return to our main selections!";
           String nns = in.nextLine().toLowerCase();
           while (!nns.equals("back")) {
               if(nns.equals("big mac")) {
                   System.out.println(bigmac.getInfo());
                   System.out.println(choice);
               } else if(nns.equals("mcchicken")) {
                   System.out.println(chicken.getInfo());
                   System.out.println(choice);
               } else if(nns.equals("cheeseburger")) {
                   System.out.println(cheeseburger.getInfo());
                   System.out.println(choice);
               } else if(nns.equals("yes")) {
                   check_burger();
               } else {
                   tryAgain();
               }
               nns = in.nextLine().toLowerCase();
           }
       }
       if (ns.contains("drink")) {
           check_drink();
           String choice = "Is there anything else on our drinks menu that you would like to know about? Type \"yes\" if so. If not, please press \"back\" to return to our main selections.";
           String ds = in.nextLine().toLowerCase();
           while (!ds.equals("back")) {
               if(ds.equals("coke")) {
                   System.out.println(soda.getInfo());
                   System.out.println(choice);
               } else if(ds.equals("apple juice")) {
                   System.out.println(aj.getInfo());
                   System.out.println(choice);
               } else if(ds.equals("hot chocolate")) {
                   System.out.println(hotcoco.getInfo());
                   System.out.println(choice);
               } else if(ds.equals("yes")) {
                   check_drink();
               } else {
                   tryAgain();
               }
               ds = in.nextLine().toLowerCase();
           }
       }
       if (ns.contains("dessert")) {
           check_dessert();
           String choice = "Is there anything else on our dessert menu that you would like to know about? Type \"yes\" if so. If not, please press \"back\" to return to our main selections.";
           String ss = in.nextLine().toLowerCase();
           while (!ss.equals("back")) {
               if(ss.equals("oreo mcflurry")) {
                   System.out.println("The ice cream machine is currently broken. We apologize for the inconvenience.");
                   System.out.println(choice);
               } else if(ss.equals("chocolate chip cookie")) {
                   System.out.println(cookie.getInfo());
                   System.out.println(choice);
               } else if(ss.equals("baked apple pie")) {
                   System.out.println(pie.getInfo());
                   System.out.println(choice);
               } else if(ss.equals("yes")) {
                   check_dessert();
               } else {
                   tryAgain();
               }
               ss = in.nextLine().toLowerCase();
           }
       }
   }
   public void check_burger(){
       System.out.println("These are our available burgers: Big Mac, McChicken, Cheeseburger. Which one would you like to know about?");
   }
   public void check_drink(){
       System.out.println("These are our available drinks: Coke, Apple Juice, Hot Chocolate. Which one would you like to know about?");
   }
   public void check_dessert(){
       System.out.println("These are our available desserts: Oreo McFlurry, Chocolate Chip Cookie, Baked Apple Pie. Which one would you like to know about?");
   }
   public void tryAgain() throws Exception {
       Thread.sleep(1500);
       String x = disappointment[(int)(Math.random() * disappointment.length)];
       System.out.println(x);
   }   
}
