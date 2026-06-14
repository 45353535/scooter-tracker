package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class j3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f64744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64745c;

    public j3(com.startapp.sdk.components.a aVar, Context context, b6 b6Var) {
        this.f64745c = aVar;
        this.f64743a = context;
        this.f64744b = b6Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f64743a;
        lb lbVar = new lb(new i3(this));
        com.startapp.sdk.components.a aVar = this.f64745c;
        return new ph(context, lbVar, aVar.E, aVar.f64183j, this.f64744b, new h3());
    }
}
