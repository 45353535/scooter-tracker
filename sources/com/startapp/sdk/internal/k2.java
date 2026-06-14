package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j2 f64812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64813e;

    public k2(Context context, String str, j2 j2Var, int i10) {
        this.f64809a = context;
        this.f64811c = str;
        this.f64812d = j2Var;
        this.f64813e = i10;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f64809a).B.a()).execute(new i2(this));
    }
}
