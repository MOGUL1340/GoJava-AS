package HW3;

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
}
