package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f57552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f57553c;

    public c(String str, Integer num, d child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f57551a = str;
        this.f57552b = num;
        this.f57553c = child;
    }

    public final d a() {
        return this.f57553c;
    }

    public final Integer b() {
        return this.f57552b;
    }
}
