package com.study;


/**
 * How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is always equal to the value of the member variable
 * kwh multiplied by the member variable rate?
 *
 * 你如何写一个方法在n1处，为了成员变量bill总是等于 rate ✖️ kwh
 *
 * Any amount of electricity used by a customer (represented by an instance of the customer class) must contribute to the customer's bill (represented by
 * the member variable bill) through the method use Electricity method. An instance of the customer class should never be able to tamper with or decrease
 * the value of the member variable bill.
 *
 */
public class Customer {

    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double Kwh){
        acct.addKwh(Kwh);
    }
}

class  ElectricAccount {
    private double kWh;

    private double rate = 0.07;

    private double bill;

    //n1

    public void addKwh(double kwh){
        this.kWh = kwh;
        this.bill = this.kWh * this.rate;
    }

}
