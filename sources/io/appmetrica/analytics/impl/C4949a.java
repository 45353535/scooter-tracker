package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4949a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76770a;

    public C4949a(Context context) {
        this.f76770a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC5253lj.a(new StringBuilder(this.f76770a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC5253lj.a(this.f76770a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
