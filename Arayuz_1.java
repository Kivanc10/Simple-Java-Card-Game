
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Action;
import javax.swing.JLabel;

/*
 * Kıvanç Aydoğmuş
    180201016
 */
/**
 *
 * @author Kivanc
 */
public class Arayuz_1 {

    // I'will pretend to overloap , I will develop functions to supply change indexes
    public static ArrayList changeIndex1(ArrayList<BasketbolcuSinifi> bb) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < bb.size(); i++) {
            if (bb.get(i).getSporcuTakim() == 1) {
                result.add(i);
                System.out.printf("%d.index eklendi\n", i);
            }
        }
        return result;
    }
//b.setBounds(10 + 210 * i, 10, 150, 250);

    public static ArrayList changeIndex2(ArrayList<BasketbolcuSinifi> bb) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < bb.size(); i++) {
            if (bb.get(i).getSporcuTakim() == 0) {
                result.add(i);
                //System.out.printf("%d.index eklendi\n",i);
            }
        }
        return result;
    }

    public static int calculateUser(ArrayList<FutbolcuSinifi> fb, ArrayList<BasketbolcuSinifi> bb) {
        int sum = 0;
        for (int i = 0; i < fb.size(); i++) {
            if (fb.get(i).getSporcuTakim() == 1) {
                sum += fb.get(i).getSporcuPuani();
            }
            if (bb.get(i).getSporcuTakim() == 1) {
                sum += bb.get(i).getSporcuPuani();
            }
        }
        return sum;
    }

    public static int calculatePc(ArrayList<FutbolcuSinifi> fb, ArrayList<BasketbolcuSinifi> bb) {
        int sum = 0;
        for (int i = 0; i < fb.size(); i++) {
            if (fb.get(i).getSporcuTakim() == 0) {
                sum += fb.get(i).getSporcuPuani();
            }
            if (bb.get(i).getSporcuTakim() == 0) {
                sum += bb.get(i).getSporcuPuani();
            }
        }
        return sum;
    }

    TextField compare_1_f = new TextField();
    TextField compare_2_f = new TextField();
    TextField compare_3_f = new TextField();
    TextField compare_4_f = new TextField();

    public static void mixCard(ArrayList<FutbolcuSinifi> fb, ArrayList<BasketbolcuSinifi> bb, JFrame f, KullaniciSinifi user, BilgisayarSinifi pc) {
        Collections.shuffle(bb);
        Collections.shuffle(fb);
        f.setLayout(null);
        // control
        ArrayList<Integer> control = new ArrayList<>();
        ArrayList<Integer> control2 = new ArrayList<>();
        // text fields
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        //skor
        TextField skor_user = new TextField();
        TextField skor_pc = new TextField();
        // infos-user

        TextField compare_1_f = new TextField();
        TextField compare_2_f = new TextField();
        TextField compare_3_f = new TextField();
        TextField compare_4_f = new TextField();
        // infos-pc
        TextField compare_1_b = new TextField();
        TextField compare_2_b = new TextField();
        TextField compare_3_b = new TextField();
        TextField compare_4_b = new TextField();
        TextField info_text = new TextField();
        TextField info_text2 = new TextField();
        TextField info_text3 = new TextField();
        TextField info_text4 = new TextField();
        TextField info_text5 = new TextField();
        TextField info_text6 = new TextField();
        TextField info_text7 = new TextField();
        JLabel secim_tur = new JLabel();
        secim_tur.setText("deneme testi");
        secim_tur.setBounds(840, 330, 300, 70);
        JLabel kazanan = new JLabel();
        kazanan.setBounds(840, 380, 200, 70);
        kazanan.setText("kazanan deneme");
        tf1.setText("PLAYER SKOR");
        tf2.setText("COMPUTER SKOR");
        // adjusting user process
        compare_1_f.setText("Compare 1 demo test");
        compare_2_f.setText("Compare 2 demo test");
        compare_3_f.setText("Compare 2 demo test");
        compare_4_f.setText("Compare 2 demo test");
        // adjusting pc process
        compare_1_b.setText("Compare 1 demo test");
        compare_2_b.setText("Compare 2 demo test");
        compare_3_b.setText("Compare 2 demo test");
        compare_4_b.setText("Compare 2 demo test");
        // info announce
        info_text.setText("Lütfen ilgili takımdan girin");
        info_text2.setText("Lütfen ilgili takımdan girin");
        info_text3.setText("İsim");
        info_text4.setText("Penaltı/ikilik");
        info_text5.setText("Serbest vuruş/atış");
        info_text6.setText("Karşı karşıya/Üçlük");
        info_text7.setText("Tür");

        //
        skor_user.setText(String.valueOf(user.getSkor()));
        skor_pc.setText(String.valueOf(pc.getSkor()));
        //
        tf1.setBounds(1750, 10, 110, 20);
        tf2.setBounds(1750, 730, 120, 20);
        //
        skor_user.setBounds(1750, 30, 110, 20);
        skor_pc.setBounds(1750, 750, 120, 20);
        //  residing -user  
        compare_1_f.setBounds(1000, 450, 200, 30);
        compare_2_f.setBounds(1000, 480, 200, 30);
        compare_3_f.setBounds(1000, 510, 200, 30);
        compare_4_f.setBounds(1000, 540, 200, 30);
        //  residing -pc
        compare_1_b.setBounds(1200, 450, 200, 30);
        compare_2_b.setBounds(1200, 480, 200, 30);
        compare_3_b.setBounds(1200, 510, 200, 30);
        compare_4_b.setBounds(1200, 540, 200, 30);
        //
        info_text.setBounds(1000, 570, 200, 30);
        info_text2.setBounds(1200, 570, 200, 30);
        info_text3.setBounds(800, 450, 200, 30);
        info_text4.setBounds(800, 480, 200, 30);
        info_text5.setBounds(800, 510, 200, 30);
        info_text6.setBounds(800, 540, 200, 30);
        info_text7.setBounds(800, 570, 200, 30);
        //
        f.add(tf1);
        f.add(tf2);
        f.add(skor_user);
        f.add(skor_pc);
        f.add(compare_1_f);
        f.add(compare_2_f);
        f.add(compare_3_f);
        f.add(compare_4_f);
        f.add(info_text3);
        f.add(info_text4);
        f.add(info_text5);
        f.add(info_text6);
        f.add(info_text7);
        f.add(secim_tur);
        f.add(kazanan);
        //
        f.add(compare_1_b);
        f.add(compare_2_b);
        f.add(compare_3_b);
        f.add(compare_4_b);
        f.add(info_text2);
        JButton play = new JButton("Play");
        JButton fix = new JButton("Fix");
        play.setBounds(850, 600, 60, 40);
        fix.setBounds(850, 280, 60, 40);
        f.add(play);
        f.add(fix);
        // ust kısım
        //futbolcu
        // döngü başlangıcı
        ArrayList<String> names = new ArrayList<>(); // new
        JButton b2 = new JButton();
        JButton b = new JButton();
        for (int i = 0; i < 8; i++) {
            if (fb.get(i).getSporcuTakim() == 0) {
                control.add(i);
                //System.out.println(control + " takımı sıfır olan");
                String name = String.format("%s", fb.get(i).getSporcuName());
                names.add(name);
                System.out.println(names);
                //b2 = new JButton("", new ImageIcon(fb.get(i).getImagePath()));
                b2 = new JButton("");
                b2.setBounds(10 + 210 * i, 730, 150, 250);
                b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        compare_1_b.setText(name);
                        //info_text2.setText("Lutfen karşı taraftan futbolcu seçin");                        
                        b2.setBounds(1200, 400, 150, 250);
                    }
                });
                f.add(b2);
                f.add(info_text2);
            }
        }
        //JButton b;
        for (int i = 0; i < 8; i++) {
            JLabel label = new JLabel("test");
            TextField takim_text = new TextField();
            if (fb.get(i).getSporcuTakim() == 1) {
                control2.add(i); // oyuncu 1 icin
                System.out.println(control2 + " takımı bir olan futbolcular");
                b = new JButton("", new ImageIcon(fb.get(i).getImagePath()));
                b.setBounds(10 + 210 * i, 10, 150, 250);
                String name = String.format("%s", fb.get(i).getSporcuName());
                String penaltı = String.format("%d", fb.get(i).getPenaltı());
                String serbest_vurus = String.format("%d", fb.get(i).getSerbestAtis());
                String karsikarsi = String.format("%d", fb.get(i).getKaleciKarsiKarsiya());
                if (control2.size() == 1) {
                    int index = control.get(0);
                    String penalti_pc = String.format("%d", fb.get(index).getPenaltı());
                    String serbest_vurus_pc = String.format("%d", fb.get(index).getSerbestAtis());
                    String karsi_pc = String.format("%d", fb.get(index).getKaleciKarsiKarsiya());
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            compare_1_f.setText(name);//  
                            compare_2_f.setText(penaltı);
                            compare_3_f.setText(serbest_vurus);
                            compare_4_f.setText(karsikarsi);
                            compare_1_b.setText(names.get(0));
                            compare_2_b.setText(penalti_pc);
                            compare_3_b.setText(serbest_vurus_pc);
                            compare_4_b.setText(karsi_pc);
                            info_text.setText("futbolcu");
                            info_text2.setText("futbolcu");
                            kazanan.setText("");
                            b2.setVisible(true);
                            b.setBounds(660, 270, 120, 220);
                            b2.setIcon(new ImageIcon(fb.get(index).getImagePath()));
                            b2.setBounds(1500,400, 150, 250);
                            int random = (int) (Math.random() * 4);
                            if (random == 0) {
                                secim_tur.setText("penaltıya göre");
                                int user_ = Integer.parseInt(compare_2_f.getText());
                                int pc_ = Integer.parseInt(compare_2_b.getText());

                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

//                                    }
//                                });
                            }
                            //
                            if (random == 1) {
                                secim_tur.setText("serbest vuruşa göre");
                                int user_ = Integer.parseInt(compare_3_f.getText());
                                int pc_ = Integer.parseInt(compare_3_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }
                            }
                            //
                            if (random == 2) {
                                secim_tur.setText("kaleciyle karşı karşıya kalmaya göre");
                                int user_ = Integer.parseInt(compare_4_f.getText());
                                int pc_ = Integer.parseInt(compare_4_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

                            }

                            //
                        } // iç fonksyion
                        // b.add action
                    });

                } // control size

                if (control2.size() == 2) {
                    int index = control.get(1);
                    String penalti_pc = String.format("%d", fb.get(index).getPenaltı());
                    String serbest_vurus_pc = String.format("%d", fb.get(index).getSerbestAtis());
                    String karsi_pc = String.format("%d", fb.get(index).getKaleciKarsiKarsiya());
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            compare_1_f.setText(name);//  
                            compare_2_f.setText(penaltı);
                            compare_3_f.setText(serbest_vurus);
                            compare_4_f.setText(karsikarsi);
                            compare_1_b.setText(names.get(1));
                            compare_2_b.setText(penalti_pc);
                            compare_3_b.setText(serbest_vurus_pc);
                            compare_4_b.setText(karsi_pc);
                            info_text.setText("Futbolcu");
                            info_text2.setText("futbolcu");
                            kazanan.setText("");
                            b2.setVisible(true);
                            //b.setBounds(660, 320, 120, 200);  
                            b.setBounds(450, 270, 120, 220);
                            b2.setIcon(new ImageIcon(fb.get(index).getImagePath()));
                            b2.setBounds(1500,400, 150, 250);

                            int random = (int) (Math.random() * 4);
                            if (random == 0) {
                                secim_tur.setText("penaltıya göre");
                                int user_ = Integer.parseInt(compare_2_f.getText());
                                int pc_ = Integer.parseInt(compare_2_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }
                            }
                            //
                            if (random == 1) {
                                secim_tur.setText("serbest vuruşa göre");
                                int user_ = Integer.parseInt(compare_3_f.getText());
                                int pc_ = Integer.parseInt(compare_3_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

                            }
                            //
                            if (random == 2) {
                                secim_tur.setText("kaleciyle karşı karşıya kalmaya göre");
                                int user_ = Integer.parseInt(compare_4_f.getText());
                                int pc_ = Integer.parseInt(compare_4_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

                            }
                        }
                    });
                }

                if (control2.size() == 3) {
                    int index = control.get(2);
                    String penalti_pc = String.format("%d", fb.get(index).getPenaltı());
                    String serbest_vurus_pc = String.format("%d", fb.get(index).getSerbestAtis());
                    String karsi_pc = String.format("%d", fb.get(index).getKaleciKarsiKarsiya());
                    //b2 = new JButton("", new ImageIcon(fb.get(index).getImagePath()));
                    //b2.setIcon(new ImageIcon(fb.get(index).getImagePath()));
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            compare_1_f.setText(name);//  
                            compare_2_f.setText(penaltı);
                            compare_3_f.setText(serbest_vurus);
                            compare_4_f.setText(karsikarsi);
                            compare_1_b.setText(names.get(2));
                            compare_2_b.setText(penalti_pc);
                            compare_3_b.setText(serbest_vurus_pc);
                            compare_4_b.setText(karsi_pc);
                            info_text.setText("futbolcu");
                            info_text2.setText("futbolcu");
                            kazanan.setText("");
                            b2.setVisible(true);
                            //b.setBounds(300, 400, 150, 250);
                            b.setBounds(250, 270, 120, 220);
                            b2.setIcon(new ImageIcon(fb.get(index).getImagePath()));
                            b2.setBounds(1500,400, 150, 250);

                            int random = (int) (Math.random() * 4);
                            if (random == 0) {
                                secim_tur.setText("penaltıya göre");
                                int user_ = Integer.parseInt(compare_2_f.getText());
                                int pc_ = Integer.parseInt(compare_2_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }
                            }
                            //
                            if (random == 1) {
                                secim_tur.setText("serbest vuruşa göre");
                                int user_ = Integer.parseInt(compare_3_f.getText());
                                int pc_ = Integer.parseInt(compare_3_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

                            }
                            //
                            if (random == 2) {
                                secim_tur.setText("kaleciyle karşı karşıya kalmaya göre");
                                int user_ = Integer.parseInt(compare_4_f.getText());
                                int pc_ = Integer.parseInt(compare_4_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }
                            }
                        }
                    });
                }

                if (control2.size() == 4) {
                    int index = control.get(3);
                    String penalti_pc = String.format("%d", fb.get(index).getPenaltı());
                    String serbest_vurus_pc = String.format("%d", fb.get(index).getSerbestAtis());
                    String karsi_pc = String.format("%d", fb.get(index).getKaleciKarsiKarsiya());
                    //b2 = new JButton("", new ImageIcon(fb.get(index).getImagePath()));
                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            compare_1_f.setText(name);//  
                            compare_2_f.setText(penaltı);
                            compare_3_f.setText(serbest_vurus);
                            compare_4_f.setText(karsikarsi);
                            compare_1_b.setText(names.get(3));
                            compare_2_b.setText(penalti_pc);
                            compare_3_b.setText(serbest_vurus_pc);
                            compare_4_b.setText(karsi_pc);
                            info_text.setText("futbolcu");
                            info_text2.setText("futbolcu");
                            kazanan.setText("");
                            b2.setVisible(true);
                            //b.setBounds(300, 400, 150, 250);
                            b.setBounds(40, 270, 120, 220);
                            b2.setIcon(new ImageIcon(fb.get(index).getImagePath()));
                            b2.setBounds(1500,400, 150, 250);
                            //System.out.println("name ==" + compare_1_f.getText());

                            int random = (int) (Math.random() * 4);
                            if (random == 0) {
                                secim_tur.setText("penaltıya göre");
                                int user_ = Integer.parseInt(compare_2_f.getText());
                                int pc_ = Integer.parseInt(compare_2_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }
                            }
                            //
                            if (random == 1) {
                                secim_tur.setText("serbest vuruşa göre");
                                int user_ = Integer.parseInt(compare_3_f.getText());
                                int pc_ = Integer.parseInt(compare_3_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

                            }
                            //
                            if (random == 2) {
                                secim_tur.setText("kaleciyle karşı karşıya kalmaya göre");
                                int user_ = Integer.parseInt(compare_4_f.getText());
                                int pc_ = Integer.parseInt(compare_4_b.getText());
                                if (user_ > pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(i).setSporcuPuani(puan);
                                            user.setSkor(calculateUser(fb, bb));
                                            skor_user.setText(Integer.toString(user.getSkor()));
                                            kazanan.setText("Player kazandı");
                                        }
                                    });

                                }
                                if (user_ < pc_) {
                                    play.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            int puan = 10;
                                            fb.get(index).setSporcuPuani(puan);
                                            pc.setSkor(calculatePc(fb, bb));
                                            skor_pc.setText(Integer.toString(pc.getSkor()));
                                            kazanan.setText("Pc kazandı");
                                        }
                                    });
                                }

                            }

                        }
                    });
                }
                f.add(b);
                f.add(info_text);
            }
        }

        // basketbolcu kodları (alt kısım)
        ArrayList<Integer> result2 = changeIndex2(bb); // pc takımı 0(önce bunlar yapılır
        ArrayList<Integer> result = changeIndex1(bb); // kullanıcı takımı 1
        JButton b4 = new JButton();
        for (int i = 0; i < 4; i++) {
            int index1 = result2.get(i);
            int index2 = control2.get(i); //
            System.out.println("basketçilerin indexleri  0 olanlar " + index2);
//            b4 = new JButton("", new ImageIcon(bb.get(index1).getImagePath()));
            b4 = new JButton("");
            b4.setBounds(10 + 210 * index2, 730, 150, 250);
            String name = String.format("%s", bb.get(index1).getSporcuName());
            String ikilik = String.format("%d", bb.get(index1).getIkilik());
            String serbest_atis = String.format("%d", bb.get(index1).getSerbestAtis());
            String ucluk = String.format("%d", bb.get(index1).getUcluk());
            b4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    compare_1_b.setText(name);
//                    info_text2.setText("basketbolcu");
//                    info_text2.setText("basketbolcu");
                    b4.setBounds(1200, 400, 150, 250);
                }
            });
            f.add(b4);
        }

        // 1 lik kısım
        JButton b3;
        ArrayList deneme = new ArrayList();
        for (int i = 0; i < 4; i++) {
            int index1 = result.get(i);
            deneme.add(index1);
            // basketbolculardan takımı 1 olanlar
            int index2 = control.get(i);
            System.out.println("basketçilerin indexleri  1 olanlar " + index2);
            b3 = new JButton("", new ImageIcon(bb.get(index1).getImagePath()));
            b3.setBounds(10 + 210 * index2, 10, 150, 250);
            String name = String.format("%s", bb.get(index1).getSporcuName());
            String ikilik = String.format("%d", bb.get(index1).getIkilik());
            String serbest_atis = String.format("%d", bb.get(index1).getSerbestAtis());
            String ucluk = String.format("%d", bb.get(index1).getUcluk());
            if (deneme.size() == 1) {
                int pc_index = result2.get(0);
                String name_pc = bb.get(pc_index).getSporcuName();
                String ikilik_pc = String.format("%d", bb.get(pc_index).getIkilik());
                String atis_pc = String.format("%d", bb.get(pc_index).getSerbestAtis());
                String ucluk_pc = String.format("%d", bb.get(pc_index).getUcluk());
                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
//                        compare_1_f.setText(name);
//                        compare_1_b.setText(name_pc);
                        compare_1_f.setText(name);//  
                        compare_2_f.setText(ikilik);
                        compare_3_f.setText(serbest_atis);
                        compare_4_f.setText(ucluk);
                        compare_1_b.setText(name_pc);
                        compare_2_b.setText(ikilik_pc);
                        compare_3_b.setText(atis_pc);
                        compare_4_b.setText(ucluk_pc);
                        info_text.setText("basketbolcu");
                        info_text2.setText("basketbolcu");
                        kazanan.setText("");
                        //b.setVisible(false);
                        b2.setVisible(false);
                        b3.setVisible(true);
                        b3.setBounds(660, 500, 120, 220);
                        b4.setIcon(new ImageIcon(bb.get(pc_index).getImagePath()));
                        b4.setBounds(1500,400, 150, 250);

                        int random = (int) (Math.random() * 4);
                        if (random == 0) {
                            secim_tur.setText("ikiliğe göre");
                            int user_basket = Integer.parseInt(compare_2_f.getText());
                            int pc_basket = Integer.parseInt(compare_2_b.getText());
                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 1) {
                            secim_tur.setText("serbest atışa göre");
                            int user_basket = Integer.parseInt(compare_3_f.getText());
                            int pc_basket = Integer.parseInt(compare_3_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 2) {
                            secim_tur.setText("üçlüğe göre");
                            int user_basket = Integer.parseInt(compare_4_f.getText());
                            int pc_basket = Integer.parseInt(compare_4_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }
                    }
                });
            }

            if (deneme.size() == 2) {
                int pc_index = result2.get(1);
                String name_pc = bb.get(pc_index).getSporcuName();
                String ikilik_pc = String.format("%d", bb.get(pc_index).getIkilik());
                String atis_pc = String.format("%d", bb.get(pc_index).getSerbestAtis());
                String ucluk_pc = String.format("%d", bb.get(pc_index).getUcluk());
                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        compare_1_f.setText(name);//  
                        compare_2_f.setText(ikilik);
                        compare_3_f.setText(serbest_atis);
                        compare_4_f.setText(ucluk);
                        compare_1_b.setText(name_pc);
                        compare_2_b.setText(ikilik_pc);
                        compare_3_b.setText(atis_pc);
                        compare_4_b.setText(ucluk_pc);
                        info_text.setText("basketbolcu");
                        info_text2.setText("basketbolcu");
                        kazanan.setText("");
                      //  b.setVisible(false);
                        b2.setVisible(false);
                        b3.setVisible(true);
                        //b3.setBounds(300, 400, 150, 250);
                        b3.setBounds(450, 500, 120, 220);
                        b4.setIcon(new ImageIcon(bb.get(pc_index).getImagePath()));
                        b4.setBounds(1500,400, 150, 250);

                        int random = (int) (Math.random() * 4);
                        if (random == 0) {
                            secim_tur.setText("ikiliğe göre");
                            int user_basket = Integer.parseInt(compare_2_f.getText());
                            int pc_basket = Integer.parseInt(compare_2_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 1) {
                            secim_tur.setText("serbest atışa göre");
                            int user_basket = Integer.parseInt(compare_3_f.getText());
                            int pc_basket = Integer.parseInt(compare_3_b.getText());
                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 2) {
                            secim_tur.setText("üçlüğe göre");
                            int user_basket = Integer.parseInt(compare_4_f.getText());
                            int pc_basket = Integer.parseInt(compare_4_b.getText());
                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }
                    }
                });
            }

            if (deneme.size() == 3) {
                int pc_index = result2.get(2);
                String name_pc = bb.get(pc_index).getSporcuName();
                String ikilik_pc = String.format("%d", bb.get(pc_index).getIkilik());
                String atis_pc = String.format("%d", bb.get(pc_index).getSerbestAtis());
                String ucluk_pc = String.format("%d", bb.get(pc_index).getUcluk());
                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        compare_1_f.setText(name);//  
                        compare_2_f.setText(ikilik);
                        compare_3_f.setText(serbest_atis);
                        compare_4_f.setText(ucluk);
                        compare_1_b.setText(name_pc);
                        compare_2_b.setText(ikilik_pc);
                        compare_3_b.setText(atis_pc);
                        compare_4_b.setText(ucluk_pc);
                        info_text.setText("basketbolcu");
                        info_text2.setText("basketbolcu");
                        kazanan.setText("");
                       // b.setVisible(false);
                        b2.setVisible(false);
                        b3.setVisible(true);
                       b3.setBounds(250 ,500,120,220);
                        b4.setIcon(new ImageIcon(bb.get(pc_index).getImagePath()));
                        b4.setBounds(1500,400, 150, 250);

                        int random = (int) (Math.random() * 4);
                        if (random == 0) {
                            secim_tur.setText("ikiliğe göre");

                            int user_basket = Integer.parseInt(compare_2_f.getText());
                            int pc_basket = Integer.parseInt(compare_2_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 1) {
                            secim_tur.setText("serbest atışa göre");
                            int user_basket = Integer.parseInt(compare_3_f.getText());
                            int pc_basket = Integer.parseInt(compare_3_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 2) {
                            secim_tur.setText("üçlüğe göre");
                            int user_basket = Integer.parseInt(compare_4_f.getText());
                            int pc_basket = Integer.parseInt(compare_4_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }
                    }
                });
            }

            if (deneme.size() == 4) {
                int pc_index = result2.get(3);
                String name_pc = bb.get(pc_index).getSporcuName();
                String ikilik_pc = String.format("%d", bb.get(pc_index).getIkilik());
                String atis_pc = String.format("%d", bb.get(pc_index).getSerbestAtis());
                String ucluk_pc = String.format("%d", bb.get(pc_index).getUcluk());

                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        compare_1_f.setText(name);//  
                        compare_2_f.setText(ikilik);
                        compare_3_f.setText(serbest_atis);
                        compare_4_f.setText(ucluk);
                        compare_1_b.setText(name_pc);
                        compare_2_b.setText(ikilik_pc);
                        compare_3_b.setText(atis_pc);
                        compare_4_b.setText(ucluk_pc);
                        info_text.setText("basketbolcu");
                        info_text2.setText("basketbolcu");
                        kazanan.setText("");
                      //  b.setVisible(false);
                        b2.setVisible(false);
                        b3.setVisible(true);
                        b3.setBounds(40,500,120,220);
                        b4.setIcon(new ImageIcon(bb.get(pc_index).getImagePath()));
                        b4.setBounds(1500,400, 150, 250);

                        int random = (int) (Math.random() * 4);
                        if (random == 0) {
                            secim_tur.setText("ikiliğe göre");

                            int user_basket = Integer.parseInt(compare_2_f.getText());
                            int pc_basket = Integer.parseInt(compare_2_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 1) {
                            secim_tur.setText("serbest atışa göre");
                            int user_basket = Integer.parseInt(compare_3_f.getText());
                            int pc_basket = Integer.parseInt(compare_3_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                        if (random == 2) {
                            secim_tur.setText("üçlüğe göre");
                            int user_basket = Integer.parseInt(compare_4_f.getText());
                            int pc_basket = Integer.parseInt(compare_4_b.getText());

                            if (user_basket > pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(index1).setSporcuPuani(puan_2);
                                        user.setSkor(calculateUser(fb, bb));
                                        skor_user.setText(Integer.toString(user.getSkor()));
                                        kazanan.setText("Player kazandı");
                                    }
                                });
                            }
                            if (user_basket < pc_basket) {
                                play.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        int puan_2 = 10;
                                        bb.get(pc_index).setSporcuPuani(puan_2);
                                        pc.setSkor(calculatePc(fb, bb));
                                        skor_pc.setText(Integer.toString(pc.getSkor()));
                                        kazanan.setText("Pc kazandı");
                                    }
                                });
                            }
                        }

                    }
                });
            }

            f.add(b3);
        }

    }
}
