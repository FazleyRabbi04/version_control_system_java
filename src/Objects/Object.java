package Objects;

import java.nio.file.Path;

public class Object {

    private Path filePath;
    protected String hash;

    public Object(Path filePath) {
        this.filePath = filePath;
    }
    
    public Object(){
    }

    public Object(Path filePath, String hash) {
        this.filePath = filePath;
        this.hash = hash;
    }

    public Path getFilePath() {
        return filePath;
    }


    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
