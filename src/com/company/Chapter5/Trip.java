package com.company.Chapter5;

public class Trip {
    Preparer preparer;
    public Trip (Preparer preparer) {
        this.preparer = preparer;
    }
    public void prepare() {
        preparer.prepare();
    }
}
