/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author arfanxn
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
      this.setQuackBehavior((new Quack()));
      this.setFlyBehavior((new FlyWithWings()));
    }
    
    @Override 
    public void display () {
        System.out.println("I'm a real mallard duck.");
    }
    
}
