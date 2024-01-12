package game_ps;

public class Game_PS {

    public static void main(String[] args) {
       //Buat Objek
       Player Hero = new Player();
       Player Enemy = new Player();
       
//       //memberi nilai atribut
       Hero.name = "Atha";
       Hero.speed = 20;
       Hero.healthPoin = 0;
       Hero.damage = 40;
       Hero.armor = 25;
       
       Enemy.name = "nafisya";
       Enemy.speed = 50;
       Enemy.healthPoin = 10;
       Enemy.damage = 30;
       Enemy.armor = 20;
       
       Hero.run();
       Hero.defense();
       Hero.attack();
       
       Enemy.run();
       Enemy.defense();
       Enemy.attack();
       
       if(Hero.isDead()){
           System.out.println("Game Over :( ");
           
       if(Enemy.isDead()){
           System.out.println("Game Over!!!");
       }    
       }
       
       drone kiran = new drone();
       
       
       kiran.energi = 10;
       kiran.ketinggian = 100;
       kiran.kecepatan = 60;
       kiran.merek = "Samsung";
       
       kiran.terbang();
       kiran.matikanMesin();
       kiran.turun();
       kiran.belok();
       kiran.maju();
       kiran.mundur();
       
       
       ikan koi = new ikan();
       koi.energi = 10;
       koi.kecepatan = 30;
       koi.ngantuk = 9;
       koi.nama = "ikan cupang";
       
       koi.berenang();
       koi.maju();
       koi.belok();
       koi.mundur();
       koi.defeat();
       
    }
    
}
