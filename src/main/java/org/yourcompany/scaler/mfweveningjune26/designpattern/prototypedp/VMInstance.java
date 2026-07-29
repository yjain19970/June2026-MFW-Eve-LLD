package org.yourcompany.scaler.mfweveningjune26.designpattern.prototypedp;

public class VMInstance implements Prototype<VMInstance> {
    private String os;
    private String runtime;
    private boolean monitoringAgent;
    private boolean securityPatches;
    private String hostname;
    private String ipAddress;

    public VMInstance(){
        
    }

    

    public VMInstance(String os, String runtime, boolean monitoringAgent, boolean securityPatches, String hostname,
            String ipAddress) {
        this.os = os;
        this.runtime = runtime;
        this.monitoringAgent = monitoringAgent;
        this.securityPatches = securityPatches;
        this.hostname = hostname;
        this.ipAddress = ipAddress;
    }



    // This is the copy constructor.
    VMInstance(VMInstance original){
        this.os = original.os;
        this.runtime = original.runtime;
        this.monitoringAgent = original.monitoringAgent;
        this.securityPatches = original.securityPatches;
    }


    public void setOs(String os) {
        this.os = os;
    }
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
    public void setMonitoringAgent(boolean monitoringAgent) {
        this.monitoringAgent = monitoringAgent;
    }
    public void setSecurityPatches(boolean securityPatches) {
        this.securityPatches = securityPatches;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public VMInstance createCopy() {
        // copy constructor here....
        return new VMInstance(this);
    }    

    
}