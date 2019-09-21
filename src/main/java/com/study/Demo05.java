package com.study;

public class Demo05 {

}
class MyVehicle {
    String type = "4W";
    int maxSpeed = 100;

    MyVehicle(){
    }
    MyVehicle(String type,int maxSpeed){
            this.type = type;
            this.maxSpeed = maxSpeed;
    }
}

class MyCar extends  MyVehicle {

    String trans;

    MyCar(String trans){
        this.trans = trans;
    }

    MyCar(String type, int maxSpeed,String trans) {
        super(type, maxSpeed);
        trans = trans;
    }
}
