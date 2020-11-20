package com.gfa.trialexam;

public class GrammarCheck {
    public static void main(String[] args) {
    /*
    Készíts egy publikus függvényt `grammarCheck` névvel,
    amely egy string-et (`text`) vár paraméterként,
    és ellenőrzi, hogy a kapott string-ben a `.` írásjelek után
    az első betűk mindenhol nagybetűk-e.
    A választ a függvény egy boolean (logikai) értékként adja vissza.

    Példák:

    grammarCheck("Ez egy jó példa. Ez egy jó példa.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik.");

    Amivel vissza kell térnie: `true`.

    grammarCheck("Ez egy rossz példa. itt nincs nagybetű.");

    Amivel vissza kell térnie: `false`.
    */
        System.out.println(grammarCheck("Ez egy jó példa. Ez egy jó példa."));
        System.out.println(grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik."));
        System.out.println(grammarCheck("Ez egy rossz példa. itt nincs nagybetű."));
    }
    public static boolean grammarCheck(String text){
        String[] arrOfStr = text.split("\\.");
        for (int i = 1; i <arrOfStr.length ; i++) {
            if (!Character.isUpperCase(arrOfStr[i].charAt(1))){
                return false;
            }
        }

        return true;
    }
}