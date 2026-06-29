package org.yourcompany.scaler.mfweveningjune26.oops.lms;

interface Lendable {
    boolean lend(User user);
    void returnItem(User user);
    boolean isAvailable();
}
