package com.wonu606.observerpattern.weatherstation.pullbased.subject;

import com.wonu606.observerpattern.weatherstation.pullbased.observer.PullBasedObserver;

public interface PullBasedSubject {

    public void registerObserver(PullBasedObserver observer);

    public void removeObserver(PullBasedObserver observer);

    public void notifyObservers();
}
