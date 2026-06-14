package com.facebook.appevents;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0 f19681b = k0.SUCCESS;

    public final int a() {
        return this.f19680a;
    }

    public final k0 b() {
        return this.f19681b;
    }

    public final void c(int i10) {
        this.f19680a = i10;
    }

    public final void d(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<set-?>");
        this.f19681b = k0Var;
    }
}
