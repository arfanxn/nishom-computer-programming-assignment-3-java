/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author arfanxn
 */
public class DuckSimulator {

   public static void main(String[] args){
       Scanner scannerIn = new Scanner(System.in);

//  ---------------------------------
//  Idk what the description is about
//  ---------------------------------
//       MallardDuck mallardDuck = new MallardDuck();
//       FlyBehavior cantFlyBehavior = () -> System.out.println("i can't fly.");
//       QuackBehavior squeakBehavior = () -> System.out.println("Squeak");
//       RubberDuck rubberDuck =  new RubberDuck(cantFlyBehavior, squeakBehavior);
//       DecoyDuck decoyDuck = new DecoyDuck();
//
//       Duck modelDuck = new ModelDuck();
//
//       mallardDuck.performQuack();
//       rubberDuck.performQuack();
//       decoyDuck.performQuack();
//
//       modelDuck.performFly();
//       modelDuck.setFlyBehavior((new FlyRocketPowered()));
//       modelDuck.performFly();

       Duck[] ducks = {new MallardDuck(), new RedHeadDuck(), new RubberDuck(), new DecoyDuck(), new ModelDuck()};
       System.out.println("Ducks: \n" +
               "1. Mallard Duck\n" +
               "2. Red Head Duck\n" +
               "3. Rubber Duck\n" +
               "4. Decoy Duck\n" +
               "5. Model Duck\n" + "Choose one of the ducks by entering a number");
       try {
           int selectedDuckNumber = scannerIn.nextInt() - 1; // subtract by one to follow the array start index
           Duck duck = ducks[selectedDuckNumber];

           duck.performFly();
           duck.performQuack();
           duck.display();
           duck.swim();

       } catch (Exception e) {
           System.out.println("Something went wrong!");
       }

   }

}
