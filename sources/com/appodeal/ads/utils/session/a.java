package com.appodeal.ads.utils.session;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final long a() {
        return SystemClock.elapsedRealtime();
    }

    public static final long b() {
        return System.currentTimeMillis();
    }
}
