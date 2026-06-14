package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static aw f28670a;

    static synchronized aw a(Context context) {
        try {
            if (f28670a == null) {
                u uVar = new u(null);
                uVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f28670a = uVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28670a;
    }
}
