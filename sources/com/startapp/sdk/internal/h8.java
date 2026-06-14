package com.startapp.sdk.internal;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class h8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg f64606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i8 f64607b;

    public h8(i8 i8Var, hg hgVar) {
        this.f64607b = i8Var;
        this.f64606a = hgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArrayA;
        this.f64606a.b();
        x1 x1Var = this.f64607b.f65590b;
        try {
            jSONArrayA = this.f64606a.f64641b.a();
        } catch (Exception unused) {
            jSONArrayA = null;
        }
        x1Var.a(jSONArrayA);
    }
}
