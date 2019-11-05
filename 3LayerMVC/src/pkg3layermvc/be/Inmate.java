/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layermvc.be;

/**
 *
 * @author jeppjleemoritzled
 */
public class Inmate {
    private int fangenummer;
    private int celle;
    private String navn;

    public Inmate(int fangenummer, int celle, String navn) {
        this.fangenummer = fangenummer;
        this.celle = celle;
        this.navn = navn;
    }

    public Inmate() {
    }
    
    

    public int getFangenummer() {
        return fangenummer;
    }

    public void setFangenummer(int fangenummer) {
        this.fangenummer = fangenummer;
    }

    public int getCelle() {
        return celle;
    }

    public void setCelle(int celle) {
        this.celle = celle;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
       return fangenummer + ", " + navn + ", " + celle; 
    }
    
    
    
}
