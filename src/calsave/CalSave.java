

package calsave;
//import java.text.* ;


public class CalSave {

   
    public static void main(String[] args) {
       CalSaveView cv = new CalSaveView();
       CalSaveModel cm = new CalSaveModel();
       CalSaveController cc = new CalSaveController(cv,cm);
       
       cv.setVisible(true);
    }

}
