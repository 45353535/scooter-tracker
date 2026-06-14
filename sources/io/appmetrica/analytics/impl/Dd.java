package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static E9 f75669a;

    public static final synchronized E9 a(Context context) {
        E9 e92;
        e92 = f75669a;
        if (e92 == null) {
            e92 = new E9(context, "uuid.dat");
            f75669a = e92;
        }
        return e92;
    }
}
