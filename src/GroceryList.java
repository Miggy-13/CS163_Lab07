import java.util.ArrayList;

public class GroceryList {

    ArrayList<Grocery> grocList = new ArrayList<Grocery>();

    public ArrayList<Grocery> getGrocList() {
        return grocList;
    }

    public void addGrocery(Grocery groc) {
        grocList.add(groc);
    }

    /*
     * Student Self-Explanation:
     * 
     *
     *
     */
    public void removeGrocery(String grocName) {
        for (Grocery g : grocList) {
            if (g.getName().equalsIgnoreCase(grocName)) { // TODO Student
                grocList.remove(g);
                break;
            }
        }
    }

    public String toString() {
        String strList = "";
        // TODO Student

        for (Grocery g : grocList) {
            strList += g.toString() + "\n";
        }

        return strList;
    }

    public String getAisleGroceries(int aisle) {
        String aisleString = "";
        // TODO Student

        for (Grocery g : grocList) {
            if (aisle == g.getAisle()) {
                aisleString += g.toString() + "\n";
            }
        }

        return aisleString;
    }

    public String getTotals() {
        double priceSum = 0;
        int caloriesSum = 0;
        for (Grocery g : grocList) {
            priceSum += g.getPrice();
            caloriesSum += g.getCalories();
        }
        String rtn = "The total price of this Grocery Trip: $" + priceSum + '\n';
        rtn += "The total calories of this Grocery Trip: " + caloriesSum + "cal\n";
        return rtn;
    }

    /*
     * public static void main(String[] args) {
     * GroceryList grocList = new GroceryList();
     * grocList.addGrocery(new Grocery("Noodles-1.99-1-1300"));
     * grocList.addGrocery(new Grocery("Eggplant-3.20-5-300"));
     * grocList.addGrocery(new Grocery("Eggs-4.50-7-640"));
     * System.out.println(grocList.toString());
     * }
     */
}