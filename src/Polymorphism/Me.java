
package Polymorphism;

public class Me extends Main {
    
    String name;
    
    Me (String name){
        this.name = name;
    }
    
    void shat(){
        System.out.println(name + "shat ta unya");
    }
     void oras(){
        System.out.println(name + "mga alas utso");
    }
      void ice(){
        System.out.println(name + "dalag ice dol");
    }
      
      public void meShat(){
          System.out.println(" Taloy " + name );
      }
}
