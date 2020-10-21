/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Bird {
    private String latinName;
    private String englishName;
    private int nrObservations;

    public Bird(String latinName, String englishName) {
        this.latinName = latinName;
        this.englishName = englishName;
        this.nrObservations = 0;
    }
    
    @Override
    public String toString() {
        return (englishName + " (" + latinName + "): " + nrObservations + " observations" );
//        Hawk (Dorkus Dorkus): 2 observations
//Crow (Corvus Corvus): 0 observations
    }

    public String getLatinName() {
        return latinName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public int getNrObservations() {
        return nrObservations;
    }

    public void incNrObservations() {
        this.nrObservations += 1;
    }
    
    
}
