package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes12.dex */
public final class M implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f76101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f76102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f76103c;

    public M(N n10, Context context, Li li) {
        this.f76103c = n10;
        this.f76101a = context;
        this.f76102b = li;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f76103c.f76147a.a(this.f76101a, this.f76102b);
    }
}
