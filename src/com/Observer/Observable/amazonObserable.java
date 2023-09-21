package com.Observer.Observable;

import com.Observer.Observers.Obserrver;

public interface amazonObserable {
    void addObserver(Obserrver o);
    void removeObserver(Obserrver o);
    void notify_all();
    void set_data(int data);
    int get_data();
}
