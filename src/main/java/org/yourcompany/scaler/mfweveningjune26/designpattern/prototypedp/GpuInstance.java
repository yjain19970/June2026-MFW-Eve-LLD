package org.yourcompany.scaler.mfweveningjune26.designpattern.prototypedp;

public class GpuInstance extends VMInstance {
    String gpuType;

    public GpuInstance(){}

    private GpuInstance(GpuInstance gpuInstance) {
        super(gpuInstance);
        this.gpuType = gpuInstance.gpuType;
    }

    // @Override
    // public GpuInstance createCopy(){
    //     return new GpuInstance(this);
    // }

    // 
}