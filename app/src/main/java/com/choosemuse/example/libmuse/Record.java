package com.choosemuse.example.libmuse;
import java.util.Date;

import java.lang.reflect.Array;

/**
 * Created by raele on 10/22/2016.
 */

    //average 72 hz std 5.8

public class Record {

    private MainActivity mainActivity;
    private double totalEeg1 = 0;
    private int countEeg1 = 0;
    private double totalEeg2 = 0;
    private int countEeg2 = 0;
    private double totalEeg3 = 0;
    private int countEeg3 = 0;
    private double totalEeg4 = 0;
    private double countEeg4 = 0;
    private double totalAccel = 0 ;
    private int countAccel = 0;

    public Record(MainActivity mainActivity) {
        this.mainActivity =  mainActivity;
    }

    //set timer for 60 seconds
    //add count for each data and add to total
    //find average and fix as data point

    protected void setTotalEeg1(double currentEeg1) {
        this.totalEeg1 += currentEeg1;
        countEeg1++;
    }

    protected void setTotalEeg2(double currentEeg2) {
        this.totalEeg2 += currentEeg2;
        countEeg2++;
    }

    protected void setTotalEeg3(double currentEeg3) {
        this.totalEeg3 += currentEeg3;
        countEeg3++;
    }

    protected void setTotalEeg4(double currentEeg4){
        this.totalEeg4 = currentEeg4;
        countEeg4++;
    }

    public void setMeanAccel(double currentAccel) {
        this.totalAccel += currentAccel;
        this.countAccel++;
    }

    protected boolean isPanicAttack(){
        return false;
    }

    protected boolean isSeizure(){
        return false;
    }

}
