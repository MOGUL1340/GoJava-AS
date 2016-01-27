package Files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {

    List<File> fileslist = new ArrayList<>();

    public void addFile(File file) {

        fileslist.add(file);

    }

    public void printCollect() {
        for (File file : fileslist) {
            System.out.println(file);
        }
    }
    public static void main(String[] args) {

    Directory dir1 = new Directory();

        AudioFile audiofile = new AudioFile("audio1",25);
        TextFile textfile = new TextFile("text1", 1);
        TextFile textfile2 = new TextFile("text2", 1);
        ImageFile imagefile = new ImageFile("image1", 2);

        dir1.addFile(audiofile);
        dir1.addFile(textfile);
        dir1.addFile(textfile2);
        dir1.addFile(imagefile);
    }
}
