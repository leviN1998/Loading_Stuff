package testing;

import sketchup.loaders.JsonLoader;

import java.io.FileNotFoundException;

/**
 * Created by levin on 17.05.2017.
 */
public class TestMain {
    public static void main(String[] args){
        JsonLoader loader = new JsonLoader();

        //HAAAAAALLLLOOOOOOOO TEST

        System.out.println();

        try {
            loader.loadFile("sprite");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
