package io.sentry.android.core.internal.util;

import io.sentry.protocol.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    public static e.b a(int i10) {
        if (i10 == 1) {
            return e.b.PORTRAIT;
        }
        if (i10 != 2) {
            return null;
        }
        return e.b.LANDSCAPE;
    }
}
