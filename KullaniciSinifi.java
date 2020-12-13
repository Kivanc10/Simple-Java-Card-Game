
import java.util.ArrayList;
import java.util.Collections;

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
public class KullaniciSinifi extends Oyuncu {

    ArrayList<Integer> kartListesi = new ArrayList<>();

    public KullaniciSinifi() {

    }

    public KullaniciSinifi(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    public void setKartListesi(int element) {
        this.kartListesi.add(element);
    }
        
    public ArrayList getKartListesi() {
        return this.kartListesi;
    }
    
    
        
    @Override
    public void kartSec(ArrayList<FutbolcuSinifi> fb, ArrayList<BasketbolcuSinifi> bb) {
        //super.kartSec(); //To change body of generated methods, choose Tools | Templates.
        int b_count_pc = 0;
        int f_count_pc = 0;
        ArrayList<Integer> appended = new ArrayList<>();
        while (b_count_pc < 4 && f_count_pc < 4) {
            int random = (int) (Math.random() * 16);
            if (random <= 7 && !appended.contains(random)) {
                fb.get(random).setSporcuTakim(1);
                appended.add(fb.get(random).getSporcuId());
                f_count_pc++;
            }
            if (random >= 8 && !appended.contains(random)) {
                int index = 0;
                if (random >= 14) {
                    index = (random == 14 ? 6 : 7);
                } else {
                    index = (random % 7) - 1;
                }
                bb.get(index).setSporcuTakim(1);
                appended.add(bb.get(index).getSporcuId());
                b_count_pc++;
            }
        }

        while (f_count_pc < 4) {
            int random = (int) (Math.random() * 8);
            if (random <= 7 & !appended.contains(random)) {
                fb.get(random).setSporcuTakim(1);
                appended.add(fb.get(random).getSporcuId());
                f_count_pc++;
            }
        }

        while (b_count_pc < 4) {
            int random = (int) (Math.random() * 8) + 7;
            int index = (random == 14 ? 7 : ((random % 7) - 1));
            if (random >= 8 && !appended.contains(random)) {
                bb.get(index).setSporcuTakim(1);
                appended.add(bb.get(index).getSporcuId());
                b_count_pc++;
            }

        }
         

    }
}
