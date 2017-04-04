package com.example.mark.sightsavers.fragment.visionsimulator;

import java.util.ArrayList;

/**
 * Created by azkei on 04/04/2017.
 * this class adds data and returns the results of the test
 */


public class ResultsData {

    ArrayList results = new ArrayList();

    public void addData(String res){
        results.add(res);
    }

    public ArrayList getResults(){
        return results;
    }
}
