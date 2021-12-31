package mvc;


/*
 * Edits:
 *   Xuefeng     3/8/21: create file
 *   Xuefeng     3/10/21: edit  file
 *   Eric        3/11/21: edit file
 * */


import java.awt.*;

public abstract class Model extends Bean{
    private Boolean unsavedChanges = false;
    private String fileName = null;

    public abstract Color getColor();
    public abstract String toString();

    public void changed(){
        unsavedChanges = true;
        firePropertyChange("color", 1, 2);
    }

    public void setUnsavedChanges(boolean saved){
        unsavedChanges = saved;
    }
    public boolean getUnsavedChanges(){
        return unsavedChanges;
    }

    public String getFileName() {
        return this.fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}