package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class k3 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f64814a;

    public k3(l3 l3Var) {
        this.f64814a = l3Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f64814a.f64848a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0));
    }
}
