package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer i : source){

            if(i < treshold){

                logger.log("Элемент " + '"' + i + '"' + " не проходит");

            }else {
                logger.log("Элемент " + '"' + i + '"' + " проходит");
                result.add(i);
            }
        }
        logger.log("Прошло фильтр " + result.size()
                + " элементов из " + source.size());

        return result;
    }
}