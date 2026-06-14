package com.ktwapps.speedometer;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.multidex.MultiDexApplication;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class AppEngine extends MultiDexApplication {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (x.l(this) == 0) {
            AppCompatDelegate.setDefaultNightMode(2);
        } else {
            AppCompatDelegate.setDefaultNightMode(1);
        }
    }
}
