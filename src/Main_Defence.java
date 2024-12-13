
import View.Helicopter;
import View.MainController;
import View.SubMarine;
import View.Tank;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sandhanu
 */
public class Main_Defence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainController mainController=MainController.getInstant();
//        MainController.main2();
       mainController.addcomponent(new Helicopter()) ;
       mainController.addcomponent(new Tank()) ;
       mainController.addcomponent(new SubMarine());

    }
    
}
