/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class BangunRuangMain {
    public static void main(String[] args){
        Bola bl = new Bola();
        bl.r = 10;
        bl.hitungVol();
        bl.hitungLuasSelimut();
    
        Tabung tb = new Tabung();
        tb.r = 10;
        tb.t = 15;
        tb.hitungVol();
        tb.hitungLuasSelimut();
        
        Kerucut kr = new Kerucut();
        kr.r = 10;
        kr.s = 15;
        kr.t = 20;
        kr.hitungVol();
        kr.hitungLuasSelimut();
        
    }
}
