package org.yourcompany.scaler.mfweveningjune26.designpattern.locksolution;


public class DBConnLockSolution {
    private static DBConnLockSolution instance;

    private String url;
    private String dbName;
    private String pwd;
    private String uName;
    private Integer maxThreads;

    private DBConnLockSolution(){

    }

    public static DBConnLockSolution getInstance(){
        if(instance == null){
            synchronized(DBConnLockSolution.class){
                if(instance ==null){
                    System.out.println("Creating a new object.....");
                    instance = new DBConnLockSolution();
                    return instance;
                }
            }
        }
        return instance;
    }

    // Double check locking.





    public String getUrl() {
        return url;
    }
    public String getDbName() {
        return dbName;
    }
    public String getPwd() {
        return pwd;
    }
    public String getuName() {
        return uName;
    }
    public Integer getMaxThreads() {
        return maxThreads;
    }
    
}
