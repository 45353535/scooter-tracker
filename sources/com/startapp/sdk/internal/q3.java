package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class q3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f65135b;

    public q3(com.startapp.sdk.components.a aVar, Context context) {
        this.f65135b = aVar;
        this.f65134a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f65134a;
        com.startapp.sdk.components.a aVar = this.f65135b;
        return new h6(context, aVar.G, aVar.f64181h);
    }
}
