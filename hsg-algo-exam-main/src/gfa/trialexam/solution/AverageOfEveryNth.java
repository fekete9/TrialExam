package com.gfa.trialexam;

public class AverageOfEveryNth {
    public static void main(String[] args) {
        /*
        Készíts egy `averageOfEveryNth` nevű publikus függvényt, ami két paramétert vár:

        - egy `numbers` nevű tömböt pozitív integer-ekkel,
        - egy `n` nevű pozitív integer-t.

        A függvény térjen vissza a kapott tömb minden `n`-edik elemének átlagával.

        Példák:

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 3)

        Amivel vissza kell térnie: `13`, mert `10` és `16` átlaga `13`.

        averageOfEveryNth(new int[] { 2, 4, 10, 34, 3, 16, 3, 21 }, 2)

        Amivel vissza kell térnie: `18.75`, mert `4`, `34`, `16`, `21` átlaga `18.75`.

        averageOfEveryNth(new int[] {2, 4, 10, 34, 3, 16, 3, 21 }, 10)

        Amivel vissza kell térnie: `0`, mert nincs érvényes elem.
    */
        System.out.println("átlaga: " + averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 3));
        System.out.println("átlaga: " + averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 2));
        System.out.println("átlaga: " + averageOfEveryNth(new int[]{2, 4, 10, 34, 3, 16, 3, 21}, 10));
    }

    public static float averageOfEveryNth(int[] number, int n) {
        float count = 0;
        float sum = 0;
        for (int i = n - 1; i < number.length; i += n) {
            sum += number[i];
            count++;
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }

    }

}