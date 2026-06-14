package com.moloco.sdk.internal;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o {
    public static final int a(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }
}
