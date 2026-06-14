package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class h4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64599b;

    public h4(com.startapp.sdk.components.a aVar, Context context) {
        this.f64599b = aVar;
        this.f64598a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f64598a;
        lb lbVar = this.f64599b.G;
        lb lbVar2 = new lb(new g4(this));
        com.startapp.sdk.components.a aVar = this.f64599b;
        return new m2(context, lbVar, lbVar2, aVar.f64183j, aVar.E, new f4());
    }
}
