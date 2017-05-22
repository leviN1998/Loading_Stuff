package sketchup.loaders;

import org.lwjgl.Sys;
import org.lwjgl.util.vector.Vector3f;
import sketchup.files.RawMtlList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by levin on 17.05.2017.
 */
public class MtlLoader {

    public void loadFile(String path) throws FileNotFoundException {
        String newPath = "res/"+path;
        this.loadFile(new File("res/"+path+".mtl"), newPath);
    }

    public void loadFile(File f, String path) throws FileNotFoundException{
        this.loadFile(new Scanner(f), path);
    }

    public void loadFile(Scanner sc, String path){

        RawMtlList list = new RawMtlList();

        while (sc.hasNextLine()){
            String ln = sc.nextLine();
            int counter = -1;


            if(ln == null || ln.equals("") || ln.startsWith("{") || ln.startsWith("}")){

            }else {

                String[] split = ln.split(" ");

                if (split[0].startsWith("newmtl")) {

                    list.getHeaders().add(split[1]);
                    counter++;

                }else if(split[0].startsWith("Ka")){

                    Vector3f vector = new Vector3f(Float.parseFloat(split[1]),
                            Float.parseFloat(split[2]), Float.parseFloat(split[3]));
                    list.getKas().add(vector);

                }else if(split[0].startsWith("Kd")){

                    Vector3f vector = new Vector3f(Float.parseFloat(split[1]),
                            Float.parseFloat(split[2]), Float.parseFloat(split[3]));
                    list.getKds().add(vector);

                }else if(split[0].startsWith("Ks")){

                    Vector3f vector = new Vector3f(Float.parseFloat(split[1]),
                            Float.parseFloat(split[2]), Float.parseFloat(split[3]));
                    list.getKss().add(vector);

                }else if (split[0].startsWith("map_Kd")){

                    list.getNames().add(counter, split[1]);

                }
            }
        }

        list.calcMats();
        return;

    }

}
