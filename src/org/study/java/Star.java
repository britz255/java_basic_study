package org.study.java;

import javax.swing.*;

/**
 * Created by YS on 2017-07-12.
 */
public class Star {
    public static void run(){
        int size = 7;

        String input = JOptionPane.showInputDialog("Please input line Star(*): ");
        size = Integer.parseInt(input);
        if (size % 2 != 1) {
            JOptionPane.showMessageDialog(null, "Input odd(1,3,5,7,9,11,13,15,...)");
            return;
        }

        int cnt = -1;
        for (int i=1; i <= size; i++) {
            if ( (size / 2) + 1 >= i ) {
                cnt += 2;
            } else {
                cnt -= 2;
            }

            for (int j=1; j <= (size-cnt)/2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j <= cnt; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
