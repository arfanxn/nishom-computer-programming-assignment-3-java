/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author arfanxn
 */
public  abstract class Duck {
    
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    
    public Duck () {}

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    abstract void display ();
    
    public void performFly () {
        this.flyBehavior.fly();
    }
    
     public void performQuack () {
        this.quackBehavior.quack();
    }
     
    public void swim () {
        System.out.println("All ducks float, even decoys");
    }
      
}
