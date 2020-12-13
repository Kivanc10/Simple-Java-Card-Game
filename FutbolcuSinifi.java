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
public class FutbolcuSinifi extends SporcuSinifi{
    private int sporcuPuani;    
    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;    
    boolean kartKullanildiMi;
    private int sporcuId=0;
    
    public FutbolcuSinifi() {
        this.sporcuPuani=0;
        this.penalti=0;        
        this.serbestAtis=0;
        this.kaleciKarsiKarsiya=0;
        this.kartKullanildiMi=false;
    }
    
     public FutbolcuSinifi(String futbolcuAdi,int futbolcuTakim,int futbolcuId){
         super(futbolcuAdi,futbolcuTakim,futbolcuId);
     }

    @Override
    public int sporcuPuaniGoster() {
        return this.sporcuPuani; //To change body of generated methods, choose Tools | Templates.
    }
    public int getSporcuPuani(){
        return this.sporcuPuani;
    }
    public int getPenaltı(){
        return this.penalti;
    }
    public int getSerbestAtis(){
        return this.serbestAtis;
    }
    public int getKaleciKarsiKarsiya(){
        return this.kaleciKarsiKarsiya;
    }
    public boolean getKartKullanildiMi(){
        return this.kartKullanildiMi;
    }
    
    public void setSporcuPuani(int sporcuPuani){
        this.sporcuPuani = sporcuPuani;
    }
    public void setPenalti(int penalti){
        this.penalti = penalti;
    }
    public void setSerbestAtis(int serbestAtis){
        this.serbestAtis = serbestAtis;
    }
    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya){
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
    public void setKartKullanma(boolean kartKullanildiMi){
        this.kartKullanildiMi = kartKullanildiMi;
    }
}
