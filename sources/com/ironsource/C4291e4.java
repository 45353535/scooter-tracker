package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4291e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MutableContextWrapper f42961a;

    public synchronized void a(Activity activity) {
        try {
            if (this.f42961a == null) {
                this.f42961a = new MutableContextWrapper(activity);
            }
            this.f42961a.setBaseContext(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        this.f42961a = null;
    }

    public Activity a() {
        return (Activity) this.f42961a.getBaseContext();
    }
}
