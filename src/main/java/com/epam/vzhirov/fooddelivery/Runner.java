package com.epam.vzhirov.fooddelivery;

import com.epam.vzhirov.fooddelivery.model.Dish;
import com.epam.vzhirov.fooddelivery.model.Ingredient;

import java.io.*;

public class Runner {

    public static void main(String[] args) throws IOException {

        Dish dish = new Dish("name",200);
        Ingredient ingr = new Ingredient("name",120);
        Ingredient ingr2 = new Ingredient("name1",120);
        dish.setIngredients(ingr, 200);
        System.out.println(dish.getCalories());
        dish.setIngredients(ingr2, 200);
        System.out.println(dish.getCalories());
        dish.removeIngreident(ingr2);
        System.out.println(dish.getCalories());


        /* FILE I/O STREAM EXAMPLE
        FileInputStream fin = new FileInputStream("test.txt");
        FileOutputStream fout = new FileOutputStream("output.txt");

        try{
            int c;
            while ((c = fin.read()) != -1){
                fout.write(c);
            }
            fin.close();
            fout.close();
        }

        catch (Exception e){
            System.out.println(e);
        }*/

        /* SCANNER EXAMPLE
        StringBuilder sb = new StringBuilder();
        FileWriter fout = new FileWriter("test.txt");
        fout.write("asfklm mmms q qqqi jgjjgj");
        fout.close();
        System.out.println("FW closed");
        FileReader fr = new FileReader("test.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNext()){
            System.out.println(scan.next());
        }
        fr.close();*/
    }
}
