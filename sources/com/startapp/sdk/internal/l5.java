package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class l5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64852b;

    public l5(com.startapp.sdk.components.a aVar, Context context) {
        this.f64852b = aVar;
        this.f64851a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new q(this.f64851a, this.f64852b.f64181h, new k5());
    }
}
