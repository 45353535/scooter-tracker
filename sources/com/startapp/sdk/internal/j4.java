package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class j4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k4 f64746a;

    public j4(k4 k4Var) {
        this.f64746a = k4Var;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        return new vf(this.f64746a.f64815a.getSharedPreferences("StartApp-6cd3cac226013e8e", 0));
    }
}
