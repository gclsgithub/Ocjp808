package com.study;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Demo16 {
    public static void main(String[] args) {
        Alpha   ref1 = new Alpha(50);
        Alpha   ref2 = new Alpha(125);
        Alpha   ref3 = new Alpha(150);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

class Alpha {
    int ns;
    static int s;
    Alpha(int ns){
        if (s < ns){
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns = "+ns+";s = "+s);
    }

}
