package testing;

import sketchup.files.RawSprite;
import sketchup.loaders.JsonLoader;
import sketchup.loaders.MtlLoader;
import sketchup.loaders.ObjLoader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by levin on 17.05.2017.
 */
public class TestMain {
    public static void main(String[] args) {


        try {
            ObjLoader.loadObj("Test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
