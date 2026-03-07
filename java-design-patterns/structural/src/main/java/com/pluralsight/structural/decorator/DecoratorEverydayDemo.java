package com.pluralsight.structural.decorator;

import java.io.*;

public class DecoratorEverydayDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text");

        doStream.close();
        oStream.close();
    }
}
