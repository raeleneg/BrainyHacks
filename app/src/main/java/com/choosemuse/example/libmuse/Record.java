package com.choosemuse.example.libmuse;

import java.lang.reflect.Array;

/**
 * Created by raele on 10/22/2016.
 */
public class Record {
    private Array mean_eeg;
    private Array mean_accel;

    protected boolean isPanicAttack(){
        return false;
    }

    protected boolean isSeizure(){
        return false;
    }

}
