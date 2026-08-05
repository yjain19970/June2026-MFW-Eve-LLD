package org.yourcompany.scaler.mfweveningjune26.decoratordp;

public class ChocoSyrup implements IceCreamConstituent {
    private IceCreamConstituent iceCreamConstituent;
    

    public ChocoSyrup(IceCreamConstituent iceCreamConstituent) {
        this.iceCreamConstituent = iceCreamConstituent;
    }

    @Override
    public Integer getCost() {
        // 
        return 20 + this.iceCreamConstituent.getCost();
    }

    @Override
    public String getDescription() {
       return "ChocoSyrup" + this.iceCreamConstituent.getDescription();
    }
    
}
