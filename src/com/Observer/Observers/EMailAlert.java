package com.Observer.Observers;

import com.Observer.Observable.amazonObserable;

public class EMailAlert implements Obserrver{
    public amazonObserable ob;
    public String email;

    public EMailAlert(amazonObserable ob, String email) {
        this.ob = ob;
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email, "In Stock Hurry!");
    }

    private void sendEmail(String email, String s) {
        System.out.println("email sent to : " + email + " msg -> " + s);
    }
}
