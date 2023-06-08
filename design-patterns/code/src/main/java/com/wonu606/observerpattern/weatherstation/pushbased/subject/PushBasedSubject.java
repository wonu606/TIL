package com.wonu606.observerpattern.weatherstation.pushbased.subject;

import com.wonu606.observerpattern.weatherstation.pushbased.observer.PushBasedObserver;

public interface PushBasedSubject {

    public void registerObserver(PushBasedObserver observer);

    public void removeObserver(PushBasedObserver observer);

    public void notifyObservers();
}
