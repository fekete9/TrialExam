package com.gfa.trialexam;

public class Censor {
    public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `censor` névvel,
    amely három string-et (karakterláncot) kér paraméterként és egy string-gel tér vissza.
    Az első string (`text`) az a szöveg, amit a függvénynek meg kell majd változtatnia.
    A második string (`originalWord`) lesz az,
    amit minden előfordulása során a harmadik string-re (`newWord`) kell megváltoztatni.
    A függvénynek térjen vissza a módosított string-el.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:

    censor("A kedvenc gyümölcsöm a(z) alma", "alma", "banán");

    Amivel vissza kell térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */
        System.out.println(censor("A kedvenc gyümölcsöm az alma", "alma", "banán"));

    }

    public static String censor(String text, String originalWord, String newWord) {
        String[] arrOfStr = text.split(" ");
        for (int i = 0; i < arrOfStr.length; i++) {

            if (originalWord.equals(arrOfStr[i])) {
                arrOfStr[i] = newWord;
            }

        }

        String StringRet = "";

        for (int i = 0; i < arrOfStr.length; i++) {
            if (StringRet == "") {

                StringRet = arrOfStr[i];

            } else {

                StringRet += " " + arrOfStr[i];
            }
        }
        return StringRet;
    }
}