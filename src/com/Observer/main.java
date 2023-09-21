package com.Observer;

import com.Observer.Observable.ObserverImpl;
import com.Observer.Observable.amazonObserable;
import com.Observer.Observers.EMailAlert;
import com.Observer.Observers.smsAlert;

public class main {
    public static void main(String[] args) {
        amazonObserable ao = new ObserverImpl();
        ao.addObserver(new EMailAlert(ao, "xyz@gmail.com"));
        ao.addObserver(new smsAlert(ao, "7832718821"));
        ao.addObserver(new smsAlert(ao, "823881382"));

        ao.set_data(2);
    }
}
