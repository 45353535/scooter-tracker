package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Or, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2326Or<T> extends AbstractRunnableC2507Vt {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Or != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC2326Or(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Or != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A08() {
        return this.A00.get();
    }
}
