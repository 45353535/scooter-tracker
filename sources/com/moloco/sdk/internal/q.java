package com.moloco.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55253b;

    public q(String description, int i10) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f55252a = description;
        this.f55253b = i10;
    }

    public final String a() {
        return this.f55252a;
    }

    public final int b() {
        return this.f55253b;
    }
}
