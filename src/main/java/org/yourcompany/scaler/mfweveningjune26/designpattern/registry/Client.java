package org.yourcompany.scaler.mfweveningjune26.designpattern.registry;

import java.util.Optional;

import org.yourcompany.scaler.mfweveningjune26.designpattern.prototypedp.VMInstance;

public class Client {
    public static void main(String[] args) {
        VMInstanceRegistry registry = new VMInstanceRegistry();
        VMInstance vmInstance32Gb = new VMInstance("linux-32gb","runtime",
         true, true, null,null);

        VMInstance vmInstance16Gb = new VMInstance("linux-16gb","runtime",
         true, true, null,null);

        registry.registerVMInstance("vm-instance-cpu-32gb", vmInstance32Gb);
        System.out.println("\n");
        registry.registerVMInstance("vm-instance-cpu-16gb", vmInstance16Gb);
        System.out.println("\n");


        registry.printRegistry();
        System.out.println("\n");


        Optional<VMInstance> vm16GbCloneOptional = registry
        .getVMInstance("vm-instance-cpu-16gb-somerandomkey");

        if(vm16GbCloneOptional.isPresent()){
            VMInstance vm16GbClone = vm16GbCloneOptional.get().createCopy();
            System.out.println("\n clone object: " + vm16GbClone);
        }
    }
}
