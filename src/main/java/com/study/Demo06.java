package com.study;

import java.io.IOException;

public class Demo06 {
    public static void main(String[] args) {
        X x = new X();
        try {
            x.printFileContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class X {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}

