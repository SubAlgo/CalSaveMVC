/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calsave;

public class CalSaveModel {

   private float sum;
   
   public CalSaveModel(){
       sum = 0;
   }

    public void cal(float day, float bath) {

        for (float i = 1; i <= day; i++) {
            sum = sum + (i * bath);
        }
    }

    public float getsum() {
        return sum;
    }
    
    public void clearsum(){
        sum = 0;
    }

}
