package com.sem.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class SemService {

    static Logger logger = LoggerFactory.getLogger(SemService.class);
    
    public List<String> getSemList(List<Integer> numberlist) {
        final List<String> semList = new ArrayList();
        for(int i=0; i<numberlist.size(); i++) {
            String semResult = numberlist.get(i) + " --> " + this.getNextBiggerNumber(i, numberlist);
            semList.add(semResult);
        };
        return semList;
    }

    protected Integer getNextBiggerNumber(Integer index, List<Integer> numberlist) {
        Integer biggerNumber = -1;
        for(int i=index+1; i<numberlist.size(); i++) {
            if (numberlist.get(index)<numberlist.get(i)) {
                biggerNumber = numberlist.get(i);
                break;
            }
        };
        return biggerNumber;
    }

}
