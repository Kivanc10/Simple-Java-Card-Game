/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kivanc
 * Kıvanç Aydoğmuş
    180201016
 */
import java.util.ArrayList;

public abstract class Oyuncu {

    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
    ArrayList<Integer> kartListesi = new ArrayList<>();

    public Oyuncu() {
        this.oyuncuID = 0;
        this.oyuncuAdi = "Henüz bir oyuncu ismi girilmedi";
        this.Skor = 0;
    }

    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
    }

    public int SkorGoster() {
        return this.Skor;
    }

    // getter
    public int getOyuncuId() {
        return this.oyuncuID;
    }

    public String getOyuncuAdi() {
        return this.oyuncuAdi;
    }

    public int getSkor() {
        return this.Skor;
    }

    public ArrayList getKartListesi() {
        return this.kartListesi;
    }

    // setter
    public void setOyuncuId(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    public void setKartListesi(int element) {
        this.kartListesi.add(element);
    }

    public void listedenElemanCikar(int index) {
        this.kartListesi.remove(index);
    }

    public void kartSec(ArrayList<FutbolcuSinifi> fb, ArrayList<BasketbolcuSinifi> bb) {

    }
}
