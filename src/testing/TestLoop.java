package testing;

import display.DisplayManager;
import lwjglstuff.entities.Light;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector3f;

/**
 * Created by levin on 17.05.2017.
 */
public class TestLoop {

    public static void main(String[] args){

        DisplayManager.createDisplay();

        Light sun = new Light(new Vector3f(0,3,0), new Vector3f(10,10,10));




        while (!Display.isCloseRequested()){




            DisplayManager.updateDisplay();
        }


        DisplayManager.closeDisplay();
    }

}
