package org.yourcompany.scaler.mfweveningjune26.decoratordp;

public class OrangeCone implements IceCreamConstituent {
    private IceCreamConstituent iceCreamConstituent;
    public OrangeCone(){
    }

    public OrangeCone(IceCreamConstituent iceCreamConstituent){
        this.iceCreamConstituent = iceCreamConstituent;
    }

    @Override
    public Integer getCost() {
        if(this.iceCreamConstituent ==null){
            return 20;
        }
        // you are a add-on.
        return 20 + this.iceCreamConstituent.getCost();
    }

    @Override
    public String getDescription() {
        if(this.iceCreamConstituent==null){
            return "Orange cone";
        }
        return "Orange cone" + this.iceCreamConstituent.getDescription();
    }
    
}
