package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class f5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64482b;

    public f5(com.startapp.sdk.components.a aVar, Context context) {
        this.f64482b = aVar;
        this.f64481a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f64481a;
        com.startapp.sdk.components.a aVar = this.f64482b;
        return new ij(context, aVar.B, aVar.M);
    }
}
