/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common.Domain;

/**
 *
 * @author purru
 */
public class Medicine {
    
    private String name, dose;
    private int id, frequency, remaining;
    
    public Medicine() {
        
    }
    
    public Medicine(String name, String dose, int id, int frequency, int remaining) {
        this.name = name;
        this.dose = dose;
        this.id = id;
        this.frequency = frequency;
        this.remaining = remaining;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDose(){
        return dose;
    }
    
    public int getRemaining(){
        return remaining;
    }
    
    public int getId(){
        return id;
    }
    
    public int getFrequency(){
        return frequency;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDose(String dose){
        this.dose = dose;
    }
    
    public void setRemaining(int remaining){
        this.remaining = remaining;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setFrequency(int frequency){
        this.frequency = frequency;
    }
    
}
