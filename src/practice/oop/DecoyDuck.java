/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author arfanxn
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.setQuackBehavior((new MuteQuack()));
        this.setFlyBehavior((new FlyWithWings()));
    }
    
    @Override 
    public void display () {
        System.out.println("I'm a duck Decoy.");
    }
    
}
