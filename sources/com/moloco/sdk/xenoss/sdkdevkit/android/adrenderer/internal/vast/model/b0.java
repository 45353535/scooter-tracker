package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57550b;

    public b0(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f57549a = str;
        this.f57550b = url;
    }

    public final String a() {
        return this.f57550b;
    }
}
