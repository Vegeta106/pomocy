package com.company;

import java.io.File;
import java.io.RandomAccessFile;

public class Main {
/*

///////////////////Pierwsze zadanie


    public static int kok(String plik1, String nazwaTowaru) {
        int zwrocenie = 0;
        File plik = new File(plik1);

        try {
            RandomAccessFile raf = new RandomAccessFile(plik, "rw");
            int licznik = 0;
            while (raf.getFilePointer() < raf.length()) {
                raf.readUTF();
                raf.readDouble();
                raf.readInt();
                licznik++;
            }
            String[] nazwy = new String[licznik];
            double[] ceny = new double[licznik];
            int[] ilosc = new int[licznik];
            int licznik1 = 0;
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                nazwy[licznik1] = raf.readUTF();
                long przedCena = raf.getFilePointer();
                ceny[licznik1] = raf.readDouble();
                ilosc[licznik1] = raf.readInt();
                if (nazwaTowaru.equals(nazwy[licznik1])){
                    zwrocenie = ilosc[licznik1];
            }
                long poIlosci = raf.getFilePointer();
                if (ilosc[licznik1] >= 100) {
                    ceny[licznik1] *= 1.1;
                    raf.seek(przedCena);
                    raf.writeDouble(ceny[licznik1]);
                    raf.seek(poIlosci);
                }
                licznik1++;
            }


        } catch (Exception ex) {
        }

    return zwrocenie;

    }



/////////////////////////Drugie zadanie

public String kok(String plik1) {
    File plik = new File(plik1);
    String najwiekszy = "";
    try {

        RandomAccessFile raf = new RandomAccessFile(plik, "rw");
        int max = 1;

           while(raf.getFilePointer()<raf.length()) {
               String nazwa = raf.readUTF();
               int pietra = raf.readInt();
               long przedCena = raf.getFilePointer();
               double cena = raf.readDouble();
               if(pietra == 1){
                   raf.seek(przedCena);
                   raf.writeDouble(cena*=1.2);
               }
               if(pietra > max) {
                   max = pietra;
                   najwiekszy = nazwa;
               }
           }
    } catch (Exception ex) {

    }
    return najwiekszy;
}
*/
/////////////////////Trzecie zadanie

    public static int[] hash(String zycieToZart[][]){

        int[] dupa = new int[zycieToZart[0].length];

        for(int i = 0; i<zycieToZart[0].length; i++) {
            int wynikmojegohasza = 0;
            for (int j = 0 ; j<zycieToZart[0][i].length(); j++) {
                wynikmojegohasza += (zycieToZart[0][i].charAt(j) - 'A'+1)*(j+1);
            }
            while(zycieToZart[1][wynikmojegohasza] != null)
                ++wynikmojegohasza;
           zycieToZart[1][wynikmojegohasza] = zycieToZart[0][i];
                            dupa[i] = wynikmojegohasza;
        }
return dupa;
    }

    public static void main(String[] args) {


    }
}
