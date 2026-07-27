package org.yourcompany.scaler.mfweveningjune26.designpattern;

public class DBConn {
    private static DBConn instance;

    private String url;
    private String dbName;
    private String pwd;
    private String uName;
    private Integer maxThreads;

    private DBConn(){

    }

    public static DBConn getInstance(){
        if(instance == null){
            System.out.println("Creating a new object.....");
            instance = new DBConn();
        }
        return instance;
    }





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


/**
 * 
 * EAGER LOADING
 * LAZY
 * 
 */