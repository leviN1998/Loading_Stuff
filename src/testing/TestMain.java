package testing;

import sketchup.files.RawSprite;
import sketchup.loaders.JsonLoader;
import sketchup.loaders.MtlLoader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by levin on 17.05.2017.
 */
public class TestMain {
    public static void main(String[] args){


        try {
            MtlLoader.loadFile("Untitled");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }






        /*JsonLoader loader = new JsonLoader();

        List<RawSprite> sprites = new ArrayList<>();

        try {
            sprites = loader.loadFile("sprite");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(sprites.get(sprites.size()-1).getFileName());*/
    }
}
