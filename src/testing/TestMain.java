package testing;

import lwjglstuff.Loader;
import org.lwjgl.util.vector.Vector3f;
import sketchup.files.RawObjModel;
import sketchup.files.RawSprite;
import sketchup.loaders.JsonLoader;
import sketchup.loaders.MtlLoader;
import sketchup.loaders.ObjLoader;
import sketchup.loaders.SketchUpLoader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by levin on 17.05.2017.
 */
public class TestMain {
    public static void main(String[] args) {


        Loader loader = new Loader();
        SketchUpLoader sketchUpLoader = new SketchUpLoader(loader);

        sketchUpLoader.loadSketchUpFile("Test");

        loader.cleanUp();
        sketchUpLoader.cleanUp();
    }
}
