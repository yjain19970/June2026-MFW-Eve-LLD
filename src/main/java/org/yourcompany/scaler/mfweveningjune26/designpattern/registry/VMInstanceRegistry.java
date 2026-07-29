package org.yourcompany.scaler.mfweveningjune26.designpattern.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.yourcompany.scaler.mfweveningjune26.designpattern.prototypedp.VMInstance;

// Can you create this as a singleton?
public class VMInstanceRegistry {
    private Map<String, VMInstance> instanceRegistry = new HashMap<>();

    public void registerVMInstance(String key, VMInstance vmInstance){
        instanceRegistry.put(key, vmInstance);
        System.out.println("Registerd the vm instance. " + instanceRegistry);
    }

    public Optional<VMInstance> getVMInstance(String key){
        return Optional.of(instanceRegistry.get(key));
    }

    public void printRegistry(){
        System.out.println("Registry: " + instanceRegistry);
    }
}
