package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class o4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64991b;

    public o4(com.startapp.sdk.components.a aVar, Context context) {
        this.f64991b = aVar;
        this.f64990a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new sf(this.f64990a, this.f64991b.D, new n4());
    }
}
