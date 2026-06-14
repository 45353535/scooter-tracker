package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class aa implements j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f64263c;

    public aa(Context context, lb lbVar, lb lbVar2) {
        this.f64261a = context;
        this.f64262b = lbVar;
        this.f64263c = lbVar2;
    }

    @Override // com.startapp.sdk.internal.j7
    public final Object a(Object obj, Object obj2, Object obj3) {
        g9 g9Var = (g9) obj;
        j9 j9Var = (j9) obj2;
        q9 q9Var = (q9) obj3;
        if (g9Var == null || j9Var == null) {
            return null;
        }
        return h9.f64615j.equals(g9Var.f64550a) ? new ba(this.f64262b, this.f64263c, g9Var, j9Var, q9Var) : new y9(this.f64261a, g9Var, j9Var, q9Var);
    }
}
