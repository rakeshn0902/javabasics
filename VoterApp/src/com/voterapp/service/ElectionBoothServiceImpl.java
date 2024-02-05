package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService{
    @Override
    public boolean checkEligibility(int age, String locality, int voterId) {
        boolean validAge = checkAge(age);
        boolean validLocality = checkLocality(locality);
        boolean validVoterId = checkVoterId(voterId);
        if (validAge && validLocality && validVoterId){
            return true;
        } else
            return false;
    }
    private boolean checkAge(int age) throws UnderAgeException{
        if(age < 18){
            throw new UnderAgeException("Voter is not eligible to caste his vote as he is under age");
        }
        return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"kormangala", "Silkboard", "whitefield"};
        boolean isLocalityFound = false;
        for (String area : localities) {
            if (area.equalsIgnoreCase(locality)) {
                isLocalityFound = true;
                break;
            }
        }
        if (!isLocalityFound) {
            throw new LocalityNotFoundException("Voter doesn't belongs to expected locality");
        } else
            return true;
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if (voterId > 9999) {
            throw new InvalidVoterIDException("VoterId is invalid");
        }
        return true;
    }
}
