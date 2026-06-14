package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.HttpClientConfig;

/* JADX INFO: loaded from: classes11.dex */
public final class ba extends z9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f64314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f64315e;

    public ba(lb lbVar, lb lbVar2, g9 g9Var, j9 j9Var, q9 q9Var) {
        super(g9Var, j9Var, q9Var);
        this.f64314d = lbVar;
        this.f64315e = lbVar2;
    }

    @Override // com.startapp.sdk.internal.z9
    public final int a() {
        String str = this.f65678a.f64554e;
        if (str == null) {
            return 3;
        }
        hf hfVar = (hf) this.f64315e.a();
        q8 q8Var = (q8) this.f64314d.a();
        ki kiVar = new ki();
        kiVar.J = hfVar.a(kiVar);
        p8 p8Var = new p8(q8Var, kiVar.a(str));
        p8Var.f65094e = null;
        p8Var.f65093d = ((HttpClientConfig) q8Var.f65149f.a()).a(kiVar.Z);
        return p8Var.a() != null ? 1 : 0;
    }
}
