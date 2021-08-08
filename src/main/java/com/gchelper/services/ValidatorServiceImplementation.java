package com.gchelper.services;

import org.springframework.stereotype.Service;

/**
 * @author Barbara Moczulska
 */

@Service
public class ValidatorServiceImplementation implements ValidatorService{

    @Override
    public boolean textValidator(String text) {
        return false;
    }

    @Override
    public boolean coordinateValidator(String text) {
        return false;
    }

    @Override
    public boolean numberValidator(String text) {
        return false;
    }
}