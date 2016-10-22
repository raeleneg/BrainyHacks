package com.choosemuse.example.libmuse;
import java.util.Date;

import java.lang.reflect.Array;

/**
 * Created by raele on 10/22/2016.
 */

    //average 72 hz std 5.8

public class Record {

    private MainActivity mainActivity;
    private double totalEegX = 0;
    private int countEegX = 0;
    private double totalEegY = 0;
    private int countEegY = 0;
    private double totalEegZ = 0;
    private int countEegZ = 0;
    private double totalAccel = 0 ;
    private int countAccel = 0;

    public Record(MainActivity mainActivity) {
        this.mainActivity =  mainActivity;
    }

    //set timer for 60 seconds
    //add count for each data and add to total
    //find average and fix as data point

    protected void setTotalEegX(double currentEegX) {
        this.totalEegX += currentEegX;
        countEegX++;
    }

    protected void setTotalEegY(double currentEegY) {
        this.totalEegY += currentEegY;
        countEegY++;
    }

    protected void setTotalEegZ(double currentEegZ) {
        this.totalEegZ += currentEegZ;
        countEegZ++;
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
