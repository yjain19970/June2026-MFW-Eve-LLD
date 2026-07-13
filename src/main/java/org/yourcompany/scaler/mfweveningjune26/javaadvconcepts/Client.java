package org.yourcompany.scaler.mfweveningjune26.javaadvconcepts;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<String,String> p1 = new Pair<>();
        p1.first = "Yash";
        p1.second = "Jain";
        p1.doSomething("yash");

        // learner name and age
        Pair<String, Integer> learnerNameToAge = new Pair<>();
        learnerNameToAge.first = "Yash";
        learnerNameToAge.second = 90;
        learnerNameToAge.doSomething(null);
        learnerNameToAge.first.length();

        Pair<List<String>, List<Integer>> xyz = new Pair<>();
        xyz.first.size();


        List<String> xxx =   Pair.doSomethingUsingStatic("true");

        // Pair using object

        PairUsingObject puo = new PairUsingObject();
        puo.first = "Yash";
        puo.second = 99;

    }

    public void doSomething(PairUsingObject puo){
        //Object c = puo.first + puo.second;
    }
}
