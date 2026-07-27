package org.yourcompany.scaler.mfweveningjune26.designpattern.singleton.eagerloading;


public class DBConnEagerLoading {

    private static DBConnEagerLoading instance = 
        new DBConnEagerLoading();

    private String url;
    private String dbName;
    private String pwd;
    private String uName;
    private Integer maxThreads;

    private DBConnEagerLoading(){

    }

    public static DBConnEagerLoading getInstance(){
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
