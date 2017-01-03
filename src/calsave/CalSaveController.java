/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calsave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalSaveController {

    private CalSaveView csv;
    private CalSaveModel csm;

    public CalSaveController(CalSaveView csv, CalSaveModel csm) {
        this.csv = csv;
        this.csm = csm;
        this.csv.clickcal(new calListener());

    }

    class calListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float d, m = 0;

            try {
                d = csv.getday();
                m = csv.getmoney();

                csm.cal(d, m);

                csv.setshow(csm.getsum());

                csm.clearsum();

            } catch (NumberFormatException ex) {
                System.out.println(ex);

            }
        }

    }

}
