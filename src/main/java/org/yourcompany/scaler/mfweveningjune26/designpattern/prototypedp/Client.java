package org.yourcompany.scaler.mfweveningjune26.designpattern.prototypedp;

public class Client {
    public static void main(String[] args) {

        // original object.
        VMInstance vmInstance = new VMInstance();

        // creating the copy...
        VMInstance copy = vmInstance.createCopy();

        copy.setHostname("hostname-2");
        copy.setIpAddress("123.123.123.123");



        // original
        GpuInstance gpuInstance = new GpuInstance();

        VMInstance copyGpuInstance =  gpuInstance.createCopy();


        System.out.println("hello");
    }
}
