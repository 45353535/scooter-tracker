package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class k4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64816b;

    public k4(com.startapp.sdk.components.a aVar, Context context) {
        this.f64816b = aVar;
        this.f64815a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f64815a;
        lb lbVar = new lb(new j4(this));
        com.startapp.sdk.components.a aVar = this.f64816b;
        return new mg(context, lbVar, aVar.f64183j, aVar.E, new i4());
    }
}
