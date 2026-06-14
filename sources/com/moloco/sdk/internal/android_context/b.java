package com.moloco.sdk.internal.android_context;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final Context a(Context context) {
        if (context != null) {
            a.f54128a.b(context);
        }
        return a.f54128a.a();
    }

    public static /* synthetic */ Context b(Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = null;
        }
        return a(context);
    }
}
