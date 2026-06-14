package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes12.dex */
public final class L implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f76039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f76040b;

    public L(N n10, Context context) {
        this.f76040b = n10;
        this.f76039a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f76040b.f76147a.a(this.f76039a);
    }
}
