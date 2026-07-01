package service;


// this can be example of open-closed principle where we have added standardfinecalculation and later
// studentfineclculation can be added without changing Fine calculator

public interface FineCalculator {
    double calculateFine(int daysLate);
}
