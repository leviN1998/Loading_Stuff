package sketchup.files;

import org.lwjgl.util.vector.Vector3f;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levin on 17.05.2017.
 */
public class RawMtlList {

    private List<String> headers;
    private List<Vector3f> Kas;
    private List<Vector3f> Kds;
    private List<Vector3f> Kss;
    private List<String> names;

    private List<RawMaterial> mats;


    public RawMtlList(){

        headers = new ArrayList<>();
        Kas = new ArrayList<>();
        Kds = new ArrayList<>();
        Kss = new ArrayList<>();
        names = new ArrayList<>();

    }

    public void calcMats(){
        //TODO:!!!
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<Vector3f> getKas() {
        return Kas;
    }

    public List<Vector3f> getKds() {
        return Kds;
    }

    public List<Vector3f> getKss() {
        return Kss;
    }

    public List<String> getNames() {
        return names;
    }
}
