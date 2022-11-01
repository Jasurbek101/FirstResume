package org.example.uz.pdp.files;

import java.io.File;

public interface BaseFiles {
    void fileRead(File file,String text);
    void fileWrite(int myId,int userId,File file,String text);
    void editFile(File file,int id);
}
