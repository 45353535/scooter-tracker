package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t f58202b;

    public g(String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t offset) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f58201a = url;
        this.f58202b = offset;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t a() {
        return this.f58202b;
    }

    public final String b() {
        return this.f58201a;
    }
}
