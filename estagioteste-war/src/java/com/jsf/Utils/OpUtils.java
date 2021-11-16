/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.Utils;

import java.util.Random;

/**
 *
 * @author
 */
public class OpUtils {

    public static int getRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
