package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class g4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4 f64543a;

    public g4(h4 h4Var) {
        this.f64543a = h4Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f64543a.f64598a.getSharedPreferences("StartApp-dfeaf103310003d9", 0));
    }
}
