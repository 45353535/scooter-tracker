package com.fyber.inneractive.sdk.util;

import com.ironsource.N6;

/* JADX INFO: loaded from: classes7.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f23894b;

    public q1(s1 s1Var, String str) {
        this.f23894b = s1Var;
        this.f23893a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23894b.f23905c.getSharedPreferences("fyber.ua", 0).edit().putString(N6.f41375d0, this.f23893a).apply();
    }
}
