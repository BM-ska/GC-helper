package com.gchelper.controllers;

import com.gchelper.services.ValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Barbara Moczulska
 */

@RestController
public class ValidatorController {

    @Autowired
    ValidatorService validatorService;

    @GetMapping("validator/{text}")
    public ResponseEntity<Boolean> text(@PathVariable String text){ return new ResponseEntity<>((validatorService.textValidator(text)), HttpStatus.OK);}

}