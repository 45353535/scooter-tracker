package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class l3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f64849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64850c;

    public l3(com.startapp.sdk.components.a aVar, Context context, b6 b6Var) {
        this.f64850c = aVar;
        this.f64848a = context;
        this.f64849b = b6Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new yh(this.f64848a, this.f64850c.E, new lb(new k3(this)), this.f64850c.f64183j, this.f64849b);
    }
}
