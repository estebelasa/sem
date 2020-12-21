package com.sem.application.rest;

import com.sem.application.service.SemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SemResource {

    static Logger logger = LoggerFactory.getLogger(SemResource.class);

    private SemService semService;
    public SemResource(final SemService semService){
        this.semService = semService;
    }

    @PostMapping(value="/getSemList")
    public ResponseEntity<List<String>> getSemList(@RequestBody List<Integer> numberList) {
        logger.info("access to getSemList");
        List<String> semList = this.semService.getSemList(numberList);
        HttpHeaders headers = new HttpHeaders();
        return ResponseEntity.ok().headers(headers).body(semList);
    }

}
