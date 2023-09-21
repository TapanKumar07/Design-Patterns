package com.Observer.Observers;

import com.Observer.Observable.amazonObserable;

public class smsAlert implements Obserrver{
    public amazonObserable ob;
    String mob;

    public smsAlert(amazonObserable ob, String mob) {
        this.ob = ob;
        this.mob = mob;
    }

    @Override
    public void update() {
      setSms(mob, "In Stock Hurry");
    }

    private void setSms(String mob, String in_stock_hurry) {
        System.out.println("Sms sent to : " + mob + " : msg -> " + in_stock_hurry);
    }
}
