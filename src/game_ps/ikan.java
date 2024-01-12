package game_ps;

public class ikan {
    //atribut
    String nama;
    int kecepatan;
    int energi;
    int ngantuk;
    
    //method
    void berenang(){
        energi--;
        if(energi > 20){
            System.out.println("ngantuk ngab,gabisa renang");
        } else {
            System.out.println("ikan berenang");
        }
    }
    
    void maju(){
        energi--;
        System.out.println("maju untuk berenang");
        kecepatan++;;
    }
    
    void belok(){
        energi--;
        System.out.println("belok agar tidak nabrak");
    }
    
    void mundur(){
        energi--;
        System.out.println("larii,ada perusak");
        kecepatan++;
    }
    
    void defeat(){
        if(ngantuk > 10 ){
            System.out.println("ikan masih ingin berenang");
        } else {
            System.out.println("mati ajaa");
        }
    }
}
