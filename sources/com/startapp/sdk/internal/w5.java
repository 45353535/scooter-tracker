package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class w5 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f65428b;

    public w5(com.startapp.sdk.components.a aVar, Context context) {
        this.f65428b = aVar;
        this.f65427a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new rk(this.f65427a, this.f65428b.f64175b);
    }
}
