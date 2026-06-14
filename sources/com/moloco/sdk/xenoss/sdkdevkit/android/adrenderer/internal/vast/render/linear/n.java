package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58306b;

    public n(String url, int i10) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f58305a = url;
        this.f58306b = i10;
    }

    public final int a() {
        return this.f58306b;
    }

    public final String b() {
        return this.f58305a;
    }
}
