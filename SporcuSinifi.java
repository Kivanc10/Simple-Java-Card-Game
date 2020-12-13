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
public abstract class SporcuSinifi {

    private String sporcuIsim;
    private int sporcuTakim;
    private int sporcuId;
    private String imagePath;

    public SporcuSinifi() {
        this.sporcuIsim = "Henüz isim girilmedi";
        this.sporcuTakim = 0;
        this.imagePath = "Henüz bir resim yolu girilmedi";
    }

    public SporcuSinifi(String sporcuIsim, int sporcuTakim, int Id) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.sporcuId = Id;
    }

    public void setSporcuIsmi(String name) {
        this.sporcuIsim = name;
    }

    public void setSporcuId(int Id) {
        this.sporcuId = Id;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setSporcuTakim(int sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public int getSporcuId() {
        return this.sporcuId;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public String getSporcuName() {
        return this.sporcuIsim;
    }

    public int getSporcuTakim() {
        return this.sporcuTakim;
    }

    public int sporcuPuaniGoster() { // override edilecek
        return 0;
    }

}
