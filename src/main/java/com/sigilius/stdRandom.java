package com.sigilius;

/**
 * Created by john on 5/30/2016.
 */
public class stdRandom {

    public static void shuffle(Object[] a) {
        int N = a.length;
        for (int i = 0; i < N ; i++) {
            int r = stdRandom.uniform( i + 1);
            exch(a, i, r);
        }
    }
}


