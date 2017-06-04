package sketchup.files;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Levin on 23.05.2017.
 */
public class RawObjList {

    private List<String> textureNames;
    private List<Vector3f> vertices;
    private List<Vector3f> normals;
    private List<Vector2f> vts;

    private List<ObjFace> faces;


    public RawObjList() {
        textureNames = new ArrayList<>();
        vertices = new ArrayList<>();
        normals = new ArrayList<>();
        vts = new ArrayList<>();
        faces = new ArrayList<>();
    }

    public ObjVertex generateVertex(int pos, int vt, int normal){
        return new ObjVertex(vertices.get(pos), vts.get(vt), normals.get(normal));
    }

    public void generateFace(ObjVertex v1, ObjVertex v2, ObjVertex v3, int textureID){
        ObjFace face = new ObjFace(v1, v2, v3, textureID);
        faces.add(face);
    }

    public List<String> getTextureNames() {
        return textureNames;
    }

    public List<Vector3f> getVertices() {
        return vertices;
    }

    public List<Vector3f> getNormals() {
        return normals;
    }

    public List<Vector2f> getVts() {
        return vts;
    }

    public List<ObjFace> getFaces() {
        return faces;
    }
}
