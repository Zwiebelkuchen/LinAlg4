package sample;
/**
 * @author: Pius Schneider
 * @version : 24.10.2017 Version: 1.0 Thema: Affine Transformation
 *
 * Enum Klasse für URL weitergabe.
 *
 */
public enum Views {

    window("Duck.fxml");

    private final String fileName;

    Views(String files){
        this.fileName = files;
    }

    public String getFileName(){
        return fileName;
    }
}