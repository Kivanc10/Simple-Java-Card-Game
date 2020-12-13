
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Kıvanç Aydoğmuş
    180201016
 */

/**
 *
 * @author Kivanc
 */
public class BilgisayarSinifi extends Oyuncu {
    ArrayList<Integer> kartListesi = new ArrayList<>();
    
    public BilgisayarSinifi() {
       
    }
    
      public BilgisayarSinifi(int oyuncuID,String oyuncuAdi,int Skor) {
        super(oyuncuID,oyuncuAdi,Skor);
    }
      
    
    public void setKartListesi(int element){
        this.kartListesi.add(element);
    }
    public ArrayList getKartListesi(){
        return this.kartListesi;
    }
      
    @Override
    public void kartSec(ArrayList<FutbolcuSinifi> fb,ArrayList<BasketbolcuSinifi> bb) {
        for(int i=0;i<fb.size();i++){
            if (fb.get(i).getSporcuTakim()==0){
                fb.get(i).setSporcuTakim(0);
            }
             if (bb.get(i).getSporcuTakim()==0){
                bb.get(i).setSporcuTakim(0);
            }
        }
    }
    
    
    
}
