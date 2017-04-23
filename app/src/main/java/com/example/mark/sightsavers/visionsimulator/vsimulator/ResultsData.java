package com.example.mark.sightsavers.visionsimulator.vsimulator;

import java.util.ArrayList;

/**
 * Created by azkei on 04/04/2017.
 * this class adds data and returns the results of the test
 */

//Singleton
public final class ResultsData {

    //to ensure first instance only
    private static ResultsData firstInstance = null;

    ArrayList<String> results = new ArrayList();

    private ResultsData(){}

    public static ResultsData getFirstInstance(){
                if(firstInstance == null){
                    firstInstance = new ResultsData();
                }
        return firstInstance;
    }

    public void addData(String res){
        results.add(res);
        //System.out.println("Successfully added: "+results.get(i));
    }

    public String getResults(int i){
        return results.get(i);
    }
}
