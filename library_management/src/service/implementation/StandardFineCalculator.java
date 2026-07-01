package service.implementation;

import service.FineCalculator;

public class StandardFineCalculator implements FineCalculator {

    @Override
    public double calculateFine(int daysLate){
        if(daysLate <= 0){
            return 0;
        }
        return daysLate*10;
    }
}
 // this can be example of open-closed principle 
