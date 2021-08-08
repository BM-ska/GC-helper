package com.gchelper.controller;

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

    @GetMapping("validator/userName/{value}")
    public ResponseEntity<Boolean> validateUserName(@PathVariable String value){ return new ResponseEntity<>((validatorService.textValidator(value)), HttpStatus.OK);}

    @GetMapping("validator/cacheName/{value}")
    public ResponseEntity<Boolean> validateCacheName(@PathVariable String value){ return new ResponseEntity<>((validatorService.textValidator(value)), HttpStatus.OK);}

    @GetMapping("validator/GCCode/{value}")
    public ResponseEntity<Boolean> validateGCCode(@PathVariable String value){ return new ResponseEntity<>((validatorService.textValidator(value)), HttpStatus.OK);}

    @GetMapping("validator/hint/{value}")
    public ResponseEntity<Boolean> validateHint(@PathVariable String value){ return new ResponseEntity<>((validatorService.textValidator(value)), HttpStatus.OK);}

    @GetMapping("validator/whenHint/{value}")
    public ResponseEntity<Boolean> validateWhenHint(@PathVariable String value){ return new ResponseEntity<>((validatorService.numberValidator(value)), HttpStatus.OK);}

    @GetMapping("validator/solveCoordinates/{value}")
    public ResponseEntity<Boolean> validateSolveCoordinates(@PathVariable String value){ return new ResponseEntity<>((validatorService.coordinateValidator(value)), HttpStatus.OK);}

    @GetMapping("validator/solveText/{value}")
    public ResponseEntity<Boolean> validateSolveText(@PathVariable String value){ return new ResponseEntity<>((validatorService.textValidator(value)), HttpStatus.OK);}

}