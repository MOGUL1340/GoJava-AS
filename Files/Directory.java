package HW3;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    public static void addFile (String[] args) {

      AudioFile audiofile = new AudioFile;
      TextFile textfile = new TextFile;
      ImageFile imagefile = new ImageFile;

      List<String> fileslist = new ArrayList<>();

      fileslist.add(audiofile);
      fileslist.add(textfile);
      fileslist.add(imagefile);

      for (String str : fileslist) {
        System.out.println(str);
      }
    }
  }
