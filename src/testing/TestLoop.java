package testing;

import display.DisplayManager;
import org.lwjgl.opengl.Display;

/**
 * Created by levin on 17.05.2017.
 */
public class TestLoop {

    public static void main(String[] args){

        DisplayManager.createDisplay();



        while (!Display.isCloseRequested()){




            DisplayManager.updateDisplay();
        }


        DisplayManager.closeDisplay();
    }

}
