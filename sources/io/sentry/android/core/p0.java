package io.sentry.android.core;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {
    public static io.sentry.r1 a(Context context, w0 w0Var) {
        return w0Var.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
