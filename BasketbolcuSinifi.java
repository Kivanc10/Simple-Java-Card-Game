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
public class BasketbolcuSinifi extends SporcuSinifi {

    private int sporcuPuani;
    boolean kartKullanildiMi;
    private int sporcuId;
    private int ikilik;
    private int ucluk;
    private int serbestAtis;

    public BasketbolcuSinifi() {
        this.ikilik = 0;
        this.serbestAtis = 0;
        this.ucluk = 0;
        this.sporcuPuani = 0;
        this.kartKullanildiMi = false;

    }

    public BasketbolcuSinifi(String basketbolcuAdi, int basketbolcuTakim, int basketbolcuId) {
        super(basketbolcuAdi, basketbolcuTakim, basketbolcuId);
    }

    @Override
    public int sporcuPuaniGoster() {
        return this.sporcuPuani; //To change body of generated methods, choose Tools | Templates.
    }

    public int getSporcuPuani() {
        return this.sporcuPuani;
    }

    public int getIkilik() {
        return this.ikilik;
    }

    public int getUcluk() {
        return this.ucluk;
    }

    public int getSerbestAtis() {
        return this.serbestAtis;
    }

    public boolean getKartKullanildiMi() {
        return this.kartKullanildiMi;
    }

    public void SetIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
    
     public void setSporcuPuani(int sporcuPuani){
        this.sporcuPuani = sporcuPuani;
    }

    public void setKartKullanma(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }
}
