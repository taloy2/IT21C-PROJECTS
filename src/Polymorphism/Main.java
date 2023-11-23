package Polymorphism;

public class Main {
    
    public static void main(String[] args){
        Me my_me = new Me(" Taloy ");
        Tanduay my_tanduay = new Tanduay(" Tanduay ");
        Redhourse my_redhourse = new Redhourse(" Redhourse ");
        
        my_me.shat();
        my_me.oras();
        my_me.ice();
        
        System.out.println("-------------------------------");
        
        my_me.meShat();
        my_tanduay.meShat();
        my_redhourse.meShat();
    }
}
