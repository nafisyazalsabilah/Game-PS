package game_ps;

/**
 *
 * @author NAFISYA
 */
public class Player {
  //atribut
    String name;
    int speed, healthPoin;
    int damage,armor;
    
    //method
    void run(){
        System.out.println(name+" is running...");
        System.out.println("Speed "+speed);
    }
    
    void attack(){
        System.out.println(name+" is attacking ");
        System.out.println("Damage "+damage);
    }
    
    void defense(){
        System.out.println(name+" is taking cover ");
        System.out.println("Defense added to "+armor);
    }
    boolean isDead(){
        if(healthPoin<=0)return true;
             return false;
    }
    
}
