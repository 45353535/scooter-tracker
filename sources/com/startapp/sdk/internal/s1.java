package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes11.dex */
public final class s1 implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f65235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f65236b;

    public s1(t1 t1Var, t1 t1Var2) {
        this.f65236b = t1Var;
        this.f65235a = t1Var2;
    }

    @Override // com.startapp.sdk.internal.ti
    public final void a() {
        ((z6) ((y6) this.f65236b.f64022i.a())).c(this.f65235a, ii.f64717v);
        t1 t1Var = this.f65236b;
        Context context = t1Var.f64014a;
        AdEventListener adEventListener = t1Var.f64017d;
        t1Var.f64017d = null;
        a0.b(context, adEventListener, t1Var.f64015b, false);
    }

    @Override // com.startapp.sdk.internal.ti
    public final void a(String str) {
        ((z6) ((y6) this.f65236b.f64022i.a())).c(this.f65235a, ii.f64718w);
        this.f65236b.f64015b.setErrorMessage(str);
        t1 t1Var = this.f65236b;
        Context context = t1Var.f64014a;
        AdEventListener adEventListener = t1Var.f64017d;
        t1Var.f64017d = null;
        a0.a(context, adEventListener, t1Var.f64015b, false);
    }
}
