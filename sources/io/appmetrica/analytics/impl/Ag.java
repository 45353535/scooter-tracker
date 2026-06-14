package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class Ag {
    public Ag(Va va2) {
    }

    public static Va a(Context context, IHandlerExecutor iHandlerExecutor) {
        C5300ng c5300ng;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c5300ng = new C5300ng(context, iHandlerExecutor);
            } catch (Throwable unused) {
                c5300ng = null;
            }
        } else {
            c5300ng = null;
        }
        return c5300ng == null ? new C5599zg() : c5300ng;
    }
}
