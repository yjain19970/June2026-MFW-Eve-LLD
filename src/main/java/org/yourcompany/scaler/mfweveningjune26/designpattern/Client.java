package org.yourcompany.scaler.mfweveningjune26.designpattern;

public class Client {
    public static void main(String[] args) {
        DBConn db1 = DBConn.getInstance();
        DBConn db2 = DBConn.getInstance();

        System.err.println("db1 " + db1);
        System.err.println("db2 " + db2);



    }
}
