package HW3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {

  List<File> fileslist = new ArrayList<>();

    public void addFile (File file) {

      fileslist.add(file);

      for (String str : fileslist) {
        System.out.println(str);
      }
    }
}
