package com.Observer.Observable;

import com.Observer.Observers.Obserrver;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements amazonObserable{
    public List<Obserrver> observers = new ArrayList<>();
    public int stocks = 0;
    @Override
    public void addObserver(Obserrver o) { observers.add(o); }

    @Override
    public void removeObserver(Obserrver o) { observers.remove(o); }

    @Override
    public void notify_all() {
      for(Obserrver o : observers) {
          o.update();
      }
    }

    @Override
    public void set_data(int data) {
       if(stocks == 0)
            notify_all();
       stocks += data;
    }

    @Override
    public int get_data() {
       return stocks;
    }
}
