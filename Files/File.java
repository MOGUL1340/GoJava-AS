package Files;

public abstract class File {
    String name;
    int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
}
