package Praktikum7;

public class segitiga extends bangun_datar {
    private double luasS;
    
    segitiga(double pX, double lX, double aX, double tX){
        super(pX, lX, aX, tX);
        
    }
    
    public void viewsegitiga() {
        System.out.println("alas   : " + alas);
        System.out.println("tinggi : " + tinggi);
    }
    
    double luasS(){
        double luasS = alas * tinggi / 2; 
        System.out.println("Luas Segitiga :" + luasS);
        return luasS;
    }
}
