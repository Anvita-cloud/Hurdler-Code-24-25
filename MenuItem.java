public class MenuItem {
    private String name;
    private int calories;
    private double money;
   
    public MenuItem(String n, int c, double m) {
        name = n;
        calories = c;
        money = m;
    }
 
 
    public String getInfo() {
        return "The " + name + " costs $" + money + " and contains " + calories + " calories.";
    }
 }
 