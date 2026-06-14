package com.inmobi.media;

import android.os.Build;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Aa {
    public static final int a() {
        return Build.VERSION.SDK_INT == 28 ? 2 : 1;
    }
}
