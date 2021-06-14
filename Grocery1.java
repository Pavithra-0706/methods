/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery1;

/**
 *
 * @author PAVITHRA M
 */
public class Grocery1 {
    public void display(){
        System.out.println("GROCERIES");
        System.out.println("\n");
        System.out.println("ID 1 =  Pens        Rs.1 per piece");
        System.out.println("ID 2 =  Pencils     Rs.5 per piece");
        System.out.println("ID 3 =  Erasers     Rs.3 per piece");
    }
    public int function(int quantity , int cost){
        System.out.println("total cost = ");
        int total_price = quantity * cost;
        return total_price;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grocery1 grocery= new Grocery1();
        grocery.display();
        int res = grocery.function(7, 8);
        System.out.println(res);
    }
    
}
