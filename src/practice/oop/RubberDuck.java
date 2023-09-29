/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author arfanxn
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setFlyBehavior((new FlyNoWay()));
//      this.setFlyBehavior((new FlyWithWings()));
        this.setQuackBehavior((
                () -> System.out.println("Squeak")
        ));
    }
    
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }
    
    @Override 
    public void display () {
        System.out.println("I'm a rubber duckie");
    }
    
}
