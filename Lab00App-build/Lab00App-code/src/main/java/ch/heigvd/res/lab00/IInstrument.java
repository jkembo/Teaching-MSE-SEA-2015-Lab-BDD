/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author jenniferkembo
 */
public interface IInstrument {
    
     /**
      * define the noise of the instrument
      * @return a string : sound of the instrument
      */
     public String play();
     
     /**
      * define the level of volume of the instrument when playing
      * @return an integer that is the level of sound that the instrument makes(can vary between 1 and 6)
      */
     public int getSoundVolume();
     
     /**
      * Define the color of the instrument
      * @return a string that represents the color of the instrument
      */
     public String getColor();
     
    
}
