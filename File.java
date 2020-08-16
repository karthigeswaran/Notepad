package Notepad;

public class File {
    private String content;
    private String name;

    public File(String name){
        this.name = name;
    }

    void writeContent(String content){
        this.content = content;
    }
    
    public String toString() {
        return content;
    }

}