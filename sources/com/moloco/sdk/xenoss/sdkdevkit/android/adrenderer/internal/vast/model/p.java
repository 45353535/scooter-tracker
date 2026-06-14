package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57596b;

    public p(String str, String impressionUrl) {
        Intrinsics.checkNotNullParameter(impressionUrl, "impressionUrl");
        this.f57595a = str;
        this.f57596b = impressionUrl;
    }

    public final String a() {
        return this.f57596b;
    }
}
