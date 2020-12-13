/*
Kıvanç Aydoğmuş
    180201016
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

//b_f.setBounds(10+190*i,10,150,250);
class CardGame_1 extends JFrame {

    // frame 
    static JFrame f;
    static JLabel l;

    // main class 
    public static void main(String[] args) {
        // create a new frame 
        f = new JFrame("Card Game"); // created to store text field and button , general panel       

        ArrayList<FutbolcuSinifi> futbolcular = new ArrayList<>();
        ArrayList<BasketbolcuSinifi> basketbolcular = new ArrayList<>();
        // foorballer

        // sporcu id ye göre olabilir
        FutbolcuSinifi Matthaus = new FutbolcuSinifi("Matthaus", 0, 0);
        Matthaus.setImagePath("./src/main/java/img/footballer1.jpg");
        Matthaus.setPenalti(81);
        Matthaus.setSerbestAtis(82);
        Matthaus.setKaleciKarsiKarsiya(65);
        futbolcular.add(Matthaus);
        FutbolcuSinifi Garay = new FutbolcuSinifi("Garay", 0, 1);
        Garay.setImagePath("./src/main/java/img/footballer2.jpg");
        Garay.setPenalti(65);
        Garay.setSerbestAtis(85);
        Garay.setKaleciKarsiKarsiya(69);
        futbolcular.add(Garay);
        FutbolcuSinifi Podolski = new FutbolcuSinifi("Podolski", 0, 2);
        Podolski.setImagePath("./src/main/java/img/footballer3.jpg");
        Podolski.setPenalti(83);
        Podolski.setSerbestAtis(88);
        Podolski.setKaleciKarsiKarsiya(89);
        futbolcular.add(Podolski);
        FutbolcuSinifi Hulk = new FutbolcuSinifi("Hulk", 0, 3);
        Hulk.setImagePath("./src/main/java/img/footballer4.jpg");
        Hulk.setPenalti(88);
        Hulk.setSerbestAtis(92);
        Hulk.setKaleciKarsiKarsiya(91);
        futbolcular.add(Hulk);
        FutbolcuSinifi Dembele = new FutbolcuSinifi("Dembele", 0, 4);
        Dembele.setImagePath("./src/main/java/img/footballer5.jpg");
        Dembele.setPenalti(80);
        Dembele.setSerbestAtis(86);
        Dembele.setKaleciKarsiKarsiya(92);
        futbolcular.add(Dembele);
        FutbolcuSinifi Iniesta = new FutbolcuSinifi("Iniesta", 0, 5);
        Iniesta.setImagePath("./src/main/java/img/footballer6.jpg");
        Iniesta.setPenalti(96);
        Iniesta.setSerbestAtis(77);
        Iniesta.setKaleciKarsiKarsiya(79);
        futbolcular.add(Iniesta);
        FutbolcuSinifi Neymar = new FutbolcuSinifi("Neymar", 0, 6);
        Neymar.setImagePath("./src/main/java/img/footballer7.jpg");
        Neymar.setPenalti(94);
        Neymar.setSerbestAtis(87);
        Neymar.setKaleciKarsiKarsiya(95);
        futbolcular.add(Neymar);
        FutbolcuSinifi Ronaldo = new FutbolcuSinifi("Ronaldo", 0, 7);
        Ronaldo.setImagePath("./src/main/java/img/footballer8.jpg");
        Ronaldo.setPenalti(95);
        Ronaldo.setKaleciKarsiKarsiya(93);
        Ronaldo.setSerbestAtis(94);
        futbolcular.add(Ronaldo);
        // basketboller
        BasketbolcuSinifi Ayton = new BasketbolcuSinifi("Ayton", 0, 8);
        Ayton.setImagePath("./src/main/java/img/basketboller1.jpg");
        Ayton.SetIkilik(82);
        Ayton.setSerbestAtis(79);
        Ayton.setUcluk(81);
        basketbolcular.add(Ayton);
        BasketbolcuSinifi Doncic = new BasketbolcuSinifi("Doncic", 0, 9);
        Doncic.setImagePath("./src/main/java/img/basketboller2.jpg");
        Doncic.SetIkilik(89);
        Doncic.setSerbestAtis(84);
        Doncic.setUcluk(86);
        basketbolcular.add(Doncic);
        BasketbolcuSinifi Ball = new BasketbolcuSinifi("Ball", 0, 10);
        Ball.setImagePath("./src/main/java/img/basketboller3.jpg");
        Ball.SetIkilik(75);
        Ball.setSerbestAtis(78);
        Ball.setUcluk(73);
        basketbolcular.add(Ball);
        BasketbolcuSinifi Wilson = new BasketbolcuSinifi("Wilson", 0, 11);
        Wilson.setImagePath("./src/main/java/img/basketboller4.jpg");
        Wilson.SetIkilik(80);
        Wilson.setSerbestAtis(74);
        Wilson.setUcluk(78);
        basketbolcular.add(Wilson);
        BasketbolcuSinifi Tatum = new BasketbolcuSinifi("Tatum", 0, 12);
        Tatum.setImagePath("./src/main/java/img/basketboller5.jpg");
        Tatum.SetIkilik(93);
        Tatum.setSerbestAtis(83);
        Tatum.setUcluk(85);
        basketbolcular.add(Tatum);
        BasketbolcuSinifi Mitchell = new BasketbolcuSinifi("Mitchell", 0, 13);
        Mitchell.setImagePath("./src/main/java/img/basketboller6.jpg");
        basketbolcular.add(Mitchell);
        Mitchell.SetIkilik(77);
        Mitchell.setSerbestAtis(70);
        Mitchell.setUcluk(72);
        BasketbolcuSinifi Allen = new BasketbolcuSinifi("Allen", 0, 14);
        Allen.setImagePath("./src/main/java/img/basketboller7.jpg");
        Allen.SetIkilik(88);
        Allen.setSerbestAtis(81);
        Allen.setUcluk(84);
        basketbolcular.add(Allen);
        BasketbolcuSinifi White = new BasketbolcuSinifi("White", 0, 15);
        White.setImagePath("./src/main/java/img/basketboller8.jpg");
        White.SetIkilik(79);
        White.setSerbestAtis(75);
        White.setUcluk(71);
        basketbolcular.add(White);
        KullaniciSinifi user = new KullaniciSinifi(1, "Kıvanç", 0);
        BilgisayarSinifi pc = new BilgisayarSinifi(0, "PC", 0);
        user.kartSec(futbolcular, basketbolcular);
        pc.kartSec(futbolcular, basketbolcular);
        Arayuz_1 interfaces_1 = new Arayuz_1();
        interfaces_1.mixCard(futbolcular, basketbolcular, f, user, pc);
        f.setSize(600, 600);
        f.show();
//        Allen.setSporcuPuani(10);
//        System.out.println(Allen.getSporcuPuani());
    }
}

/*
We can compare game card accroding to text fields
such as we can compare if compare_1_f > compare_2_f (assuming)
user's point increasing ...
Integer.parseInt(user_skor.getText())
 */
