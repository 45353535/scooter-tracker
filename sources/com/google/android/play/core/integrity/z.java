package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f28754a;

    static synchronized s a(Context context) {
        try {
            if (f28754a == null) {
                q qVar = new q(null);
                qVar.a(com.google.android.play.integrity.internal.ag.a(context));
                f28754a = qVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28754a;
    }
}
